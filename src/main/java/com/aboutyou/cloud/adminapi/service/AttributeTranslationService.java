package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class AttributeTranslationService extends AbstractService {
    public AttributeTranslationService(HttpClient httpClient) {
        super(httpClient);
    }

    public void updateOrCreate(String attributeName, Map<String, String> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeName), null, null, model);
    }

    public void updateOrCreate(String attributeName, Map<String, String> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeName), options, null, model);
    }

    public ApiCollection<Map<String, String>> all(String attributeName) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeName), null, responseModel);
    }

    public ApiCollection<Map<String, String>> all(String attributeName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeName), options, responseModel);
    }

}