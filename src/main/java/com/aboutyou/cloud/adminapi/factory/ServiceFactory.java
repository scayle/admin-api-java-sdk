package com.aboutyou.cloud.adminapi.factory;

import java.util.HashMap;
import java.util.Map;

import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.service.AbstractService;

public class ServiceFactory {
    private HttpClient httpClient;
    private Map<String, AbstractService> instances;

    public ServiceFactory(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.instances = new HashMap<>();
    }

    public <T> T getService(String className) {
        if (!this.instances.containsKey(className)) {
            try {
                Class<?> clazz = Class.forName(className);
                Object instance = clazz.getDeclaredConstructor(HttpClient.class).newInstance(this.httpClient);

                if (instance instanceof AbstractService) {
                    AbstractService service = (AbstractService) instance;
                    this.instances.put(className, service);
                }
            } catch (Exception exception) {
                System.err.println(exception.getMessage());
                return null;
            }
        }

        return (T) this.instances.get(className);
    }
}
