package com.scayle.adminapi.model;

import lombok.Getter;

@Getter
public class RateLimit {
    private String scope;
    private Integer limit;
    private Integer remaining;
    private Integer reset;

    public RateLimit(String scope, Integer limit, Integer remaining, Integer reset) {
        this.scope = scope;
        this.limit = limit;
        this.remaining = remaining;
        this.reset = reset;
    }
}