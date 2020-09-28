package com.aboutyou.cloud.adminapi.model;

import java.util.HashMap;
import java.util.Map;

public class ApiOptions {
    private final Map<String, String> options;

    private ApiOptions(Map<String, String> options) {
        this.options = options;
    }

    public Map<String, String> getOptions() {
        return this.options;
    }

    public static ApiOptionsBuilder builder() {
        return new ApiOptionsBuilder();
    }

    public static class ApiOptionsBuilder {
        private final Map<String, String> options;

        public ApiOptionsBuilder() {
            this.options = new HashMap<String, String>();
        }

        public ApiOptionsBuilder addOption(String key, String value) {
            this.options.put(key, value);
            return this;
        }

        public ApiOptions build() {
            return new ApiOptions(this.options);
        }
    }
}
