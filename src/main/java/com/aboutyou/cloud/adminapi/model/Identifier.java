package com.aboutyou.cloud.adminapi.model;

import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Identifier {
    private String identifier;

    private Identifier(String identifier) {
        this.identifier = identifier;
    }

    public static Identifier fromId(Integer id) {
        return new Identifier(Integer.toString(id));
    }

    public static Identifier fromKey(String referenceKey) throws UnsupportedEncodingException {

        return new Identifier(
            URLEncoder.encode(
                "key=" + referenceKey,
                StandardCharsets.UTF_8.name()
            )
        );
    }

    public String toString() {
        return this.identifier;
    }
}
