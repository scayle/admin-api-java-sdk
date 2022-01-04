package com.aboutyou.cloud.adminapi.http;

import java.io.IOException;
import java.util.Map;

import com.aboutyou.cloud.adminapi.model.ApiConfiguration;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Request.Builder;

public class HttpClient {
    private OkHttpClient httpClient;
    private ApiConfiguration apiConfiguration;

    public HttpClient(ApiConfiguration apiConfiguration) {
        this.httpClient = new OkHttpClient();
        this.apiConfiguration = apiConfiguration;
    }

    public Response request(String httpMethod, String relativeUrl, Map<String, Object> query, Map<String, Object> headers, String body) throws IOException {
        httpMethod = httpMethod.toUpperCase();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(this.apiConfiguration.getUrl() + relativeUrl).newBuilder();

        if (query != null) {
            for (String key : query.keySet()) {
                urlBuilder.addQueryParameter(key, String.valueOf(query.get(key)));
            }
        }

        Builder builder = new Request.Builder()
            .header("X-Access-Token", this.apiConfiguration.getAccessToken())
            .url(urlBuilder.build().toString());

        if (headers != null) {
            for (String key : headers.keySet()) {
                Object value = headers.get(key);

                if (value != null) {
                    builder.header(key, String.valueOf(value));
                }
            }
        }

        RequestBody requestBody = null;

        if (body != null) {
            builder.header("Content-Type", "application/json");
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            requestBody = RequestBody.create(body, mediaType);
        }

        if (body == null && httpMethod.equals("POST")) {
            requestBody = RequestBody.create(null, new byte[0]);
        }

        Request request = builder.method(httpMethod, requestBody).build();

        return httpClient.newCall(request).execute();
    }
}
