package com.scayle.adminapi.model;

import lombok.Builder;
import lombok.Getter;
import okhttp3.OkHttpClient;

@Getter
@Builder(toBuilder = true)
public class ApiConfiguration {
    private final String url;
    private final String accessToken;
    /**
     * Optional; when null, the SDK uses a default {@link OkHttpClient}.
     */
    private final OkHttpClient httpClient;
}