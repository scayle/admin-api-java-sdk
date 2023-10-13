package com.scayle.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.scayle.adminapi.exception.ApiErrorException;
import com.scayle.adminapi.exception.ConnectionException;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.*;

@SuppressWarnings("unchecked")
public class AttributeTranslationService extends AbstractService {
    public AttributeTranslationService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void updateOrCreate(String attributeGroupName, Map<String, String> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeGroupName), null, null, null, model);
    }

    
    public void updateOrCreate(String attributeGroupName, Map<String, String> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/attributes/%s/translations", attributeGroupName), query, null, null, model);
    }

    
    public ApiCollection<Map<String, String>> all(String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeGroupName), null, null, responseModel);
    }

    
    public ApiCollection<Map<String, String>> all(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, String>> responseModel = (Class<Map<String, String>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/attributes/%s/translations", attributeGroupName), query, null, responseModel);
    }

}
