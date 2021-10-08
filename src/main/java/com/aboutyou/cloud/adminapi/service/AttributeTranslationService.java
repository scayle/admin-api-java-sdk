package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class AttributeTranslationService extends AbstractService {
    public AttributeTranslationService(HttpClient httpClient) {
        super(httpClient);
    }

    public void updateOrCreate(String attributeGroupName, Map<String, String> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeGroupName), null, null, model);
    }

    public void updateOrCreate(String attributeGroupName, Map<String, String> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeGroupName), options, null, model);
    }

    public ApiCollection<Map<String, String>> all(String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeGroupName), null, responseModel);
    }

    public ApiCollection<Map<String, String>> all(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeGroupName), options, responseModel);
    }

}