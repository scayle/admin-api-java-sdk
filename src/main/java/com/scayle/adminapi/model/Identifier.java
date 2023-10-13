package com.scayle.adminapi.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Identifier {
    private String identifier;

    private Identifier(String identifier) {
        this.identifier = identifier;
    }

    public static Identifier fromId(Integer id) {
        return new Identifier(Integer.toString(id));
    }

    public static Identifier fromKey(String referenceKey) {

        return new Identifier(
            URLEncoder.encode(
                "key=" + referenceKey,
                StandardCharsets.UTF_8
            )
        );
    }

    public String toString() {
        return this.identifier;
    }
}
