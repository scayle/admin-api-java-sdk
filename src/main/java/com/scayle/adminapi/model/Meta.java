package com.scayle.adminapi.model;

import lombok.Getter;

@Getter
public class Meta {
    private RateLimit rateLimit;

    public Meta(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }
}