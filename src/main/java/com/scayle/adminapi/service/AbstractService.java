package com.scayle.adminapi.service;

import java.util.Map;
import java.lang.NumberFormatException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.scayle.adminapi.serializer.JsonSerializer;
import com.scayle.adminapi.exception.ApiErrorException;
import com.scayle.adminapi.exception.ConnectionException;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.ApiCollection;
import com.scayle.adminapi.model.Meta;
import com.scayle.adminapi.model.RateLimit;
import com.scayle.adminapi.model.AbstractApiObject;

import okhttp3.Request;
import okhttp3.Response;

public abstract class AbstractService {

    private HttpClient httpClient;
    private JsonSerializer jsonSerializer;

    public AbstractService(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.jsonSerializer = new JsonSerializer();
    }

    protected <T> T request(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, Class<T> modelClass) throws ApiErrorException, ConnectionException {
        return this.request(httpMethod, relativeUrl, query, headers, modelClass, null);
    }

    protected <T> T request(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, Class<T> modelClass, Object body) throws ApiErrorException, ConnectionException {
        try {
            Response response = this.executeRequest(httpMethod, relativeUrl, query, headers, body);
            Integer statusCode = response.code();

            if (statusCode >= 200 && statusCode < 300) {

                String contentType = response.header("Content-Type");
                boolean isFile = contentType != null && contentType.startsWith("application/pdf");

                if (isFile) {
                    return (T) response.body().bytes();
                }

                String responseBodyContent = response.body().string();
                if (responseBodyContent == null || responseBodyContent.isEmpty()) {
                    return null;
                }

                T model = this.jsonSerializer.unserializeApiObject(responseBodyContent, modelClass);

                if (model instanceof AbstractApiObject) {
                    AbstractApiObject apiObject = (AbstractApiObject) model;

                    RateLimit rateLimit = new RateLimit(
                        response.header("X-RateLimit-Scope"),
                        parseIntegerHeader(response.header("X-RateLimit-Limit")),
                        parseIntegerHeader(response.header("X-RateLimit-Remaining")),
                        parseIntegerHeader(response.header("X-RateLimit-Reset"))
                    );

                    apiObject.setMeta(new Meta(rateLimit));
                }

                return model;
            } else {
                Request request = response.request();
                String responseBodyContent = response.body().string();
                String url = request.url().toString();
                JsonElement errorResponse = this.jsonSerializer.unserialize(responseBodyContent, JsonElement.class);

                throw new ApiErrorException(null == errorResponse ? new JsonObject() : errorResponse.getAsJsonObject(), url, statusCode);
            }
        } catch (ApiErrorException apiException) {
            throw apiException;
        } catch (Exception exception) {
            throw new ConnectionException(exception.getMessage(), exception);
        }
    }

    protected <T> ApiCollection<T> requestCollection(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, Class<T> modelClass) throws ApiErrorException, ConnectionException {
        return this.requestCollection(httpMethod, relativeUrl, query, headers, modelClass, null);
    }

    protected <T> ApiCollection<T> requestCollection(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, Class<T> modelClass, Object body) throws ApiErrorException, ConnectionException {
        try {
                Response response = this.executeRequest(httpMethod, relativeUrl, query, headers, body);
                String responseBodyContent = response.body().string();
                Integer statusCode = response.code();

                if (statusCode >= 200 && statusCode < 300) {
                    if(responseBodyContent == null || responseBodyContent.isEmpty()) {
                            return null;
                    }

                    ApiCollection<T> collection = this.jsonSerializer.unserializeApiCollection(responseBodyContent, modelClass);

                    RateLimit rateLimit = new RateLimit(
                        response.header("X-RateLimit-Scope"),
                        parseIntegerHeader(response.header("X-RateLimit-Limit")),
                        parseIntegerHeader(response.header("X-RateLimit-Remaining")),
                        parseIntegerHeader(response.header("X-RateLimit-Reset"))
                    );

                    collection.setMeta(new Meta(rateLimit));

                    return collection;
                } else {
                    Request request = response.request();
                    String url = request.url().toString();
                    JsonElement errorResponse = this.jsonSerializer.unserialize(responseBodyContent, JsonElement.class);

                    throw new ApiErrorException(null == errorResponse ? new JsonObject() : errorResponse.getAsJsonObject(), url, statusCode);
                }
            } catch (ApiErrorException apiException) {
                throw apiException;
            } catch (Exception exception) {
                throw new ConnectionException(exception.getMessage(), exception);
        }
    }

    protected String resolvePath(String path, Object... params) {
        return String.format(path, params);
    }

    private Response executeRequest(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, Object body) throws Exception {
        String jsonRequestBody = null;

        if (body != null) {
            jsonRequestBody = this.jsonSerializer.serializeApiObject(body);
        }

        return this.httpClient.request(httpMethod, relativeUrl, query, headers, jsonRequestBody);
    }

    private Integer parseIntegerHeader(String headerValue) {
        try {
            return headerValue != null ? Integer.parseInt(headerValue) : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
