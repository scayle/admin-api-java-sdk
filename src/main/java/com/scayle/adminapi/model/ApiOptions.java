package com.scayle.adminapi.model;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ApiOptions {
    private final Map<String, Object> options;

    private ApiOptions(Map<String, Object> options) {
        this.options = options;
    }

    public Map<String, Object> all() {
        return this.options;
    }

    public Map<String, Object> except(List<String> keys) {
        Map<String, Object> options = new HashMap<String, Object>();

        for (String key : this.options.keySet()) {
            if (!keys.contains(key)) {
                options.put(key, this.options.get(key));
            }
        }

        return options;
    }

    public Object get(String key) {
        return this.options.get(key);
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
