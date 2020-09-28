package com.aboutyou.cloud.adminapi.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiConfiguration {
    private final String url;
    private final String accessToken;
}