package com.scayle.adminapi.exception;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Iterables;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ApiErrorException extends RuntimeException {
    private List<ApiError> errors;
    private String url;
    private Integer statusCode;

    public ApiErrorException(JsonObject errorResponse, String url, Integer statusCode) {
        this.errors = this.parseErrorResponse(errorResponse);
        this.statusCode = statusCode;
        this.url = url;
    }

    public String getMessage() {
        ApiError firstError = this.getFirstError();
        String reasonPhrase = firstError == null ? "No error message" : firstError.getMessage();

        return String.format("Client error response [url] %s [status code] %d [reason phrase] %s", this.url, this.statusCode, reasonPhrase);
    }

    public ApiError getFirstError() {
        return Iterables.getLast(this.errors);
    }

    public List<ApiError> getErrors() {
        return this.errors;
    }

    private List<ApiError> parseErrorResponse(JsonObject errorResponse) {
        List<ApiError> errors = new ArrayList<>();

        if (!errorResponse.has("errors")) {
            return errors;
        }

        for (JsonElement error : errorResponse.getAsJsonArray("errors")) {
            JsonObject errorObject = error.getAsJsonObject();

            String errorKey = errorObject.getAsJsonPrimitive("errorKey").getAsString();
            String message = errorObject.getAsJsonPrimitive("message").getAsString();
            Object context = errorObject.getAsJsonObject("context").toString();

            ApiError apiError = new ApiError(errorKey, message, context);
            errors.add(apiError);
        }

        return errors;
    }
}
