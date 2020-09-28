package com.aboutyou.cloud.adminapi.exception;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ApiError {
    @SerializedName("errorKey")
    String errorKey;

    @SerializedName("message")
    String message;

    @SerializedName("context")
    Object context;

    public ApiError(String errorKey, String message, Object context) {
        this.errorKey = errorKey;
        this.message = message;
        this.context = context;
    }
}
