package com.aboutyou.cloud.adminapi.exception;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Iterables;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ApiErrorException extends RuntimeException {
    private List<ApiError> errors;
    private Integer statusCode;

    public ApiErrorException(JsonObject errorResponse, Integer statusCode) {
        this.errors = this.parseErrorResponse(errorResponse);
        this.statusCode = statusCode;
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
