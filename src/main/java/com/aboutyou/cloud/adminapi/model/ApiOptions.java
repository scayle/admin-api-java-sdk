package com.aboutyou.cloud.adminapi.model;

import java.util.HashMap;
import java.util.Map;

public class ApiOptions {
    private final Map<String, Object> options;

    private ApiOptions(Map<String, Object> options) {
        this.options = options;
    }

    public Map<String, Object> getOptions() {
        return this.options;
    }

    public static ApiOptionsBuilder builder() {
        return new ApiOptionsBuilder();
    }

    public static class ApiOptionsBuilder {
        private final Map<String, Object> options;

        public ApiOptionsBuilder() {
            this.options = new HashMap<String, Object>();
        }

        public ApiOptionsBuilder addOption(String key, Object value) {
            this.options.put(key, value);
            return this;
        }

        public ApiOptions build() {
            return new ApiOptions(this.options);
        }
    }
}
