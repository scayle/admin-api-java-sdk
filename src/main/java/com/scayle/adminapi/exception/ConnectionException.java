package com.scayle.adminapi.exception;

public class ConnectionException extends RuntimeException {

    private final String responseBody;

    public ConnectionException(String message, Throwable cause) {
        this(message, cause, null);
    }

    public ConnectionException(String message, Throwable cause, String responseBody) {
        super(buildMessage(message, responseBody), cause);
        this.responseBody = responseBody;
    }

    private static String buildMessage(String message, String responseBody) {
        if (responseBody == null || responseBody.isEmpty()) {
            return message;
        }
        int maxPreview = 500;
        String preview = responseBody.length() > maxPreview
            ? responseBody.substring(0, maxPreview) + "... [truncated, total " + responseBody.length() + " chars]"
            : responseBody;
        return message + " Response body: " + preview;
    }

    public String getResponseBody() {
        return responseBody;
    }
}