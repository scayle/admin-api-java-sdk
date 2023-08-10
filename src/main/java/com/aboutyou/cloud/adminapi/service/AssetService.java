package com.aboutyou.cloud.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class AssetService extends AbstractService {
    public AssetService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public AssetUrl create(Asset model) throws ApiErrorException, ConnectionException {
        Class<AssetUrl> responseModel = (Class<AssetUrl>)(Class<?>)AssetUrl.class;

        return this.request("post", this.resolvePath("/assets"), null, null, responseModel, model);
    }

    
    public AssetUrl create(Asset model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AssetUrl> responseModel = (Class<AssetUrl>)(Class<?>)AssetUrl.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/assets"), query, null, responseModel, model);
    }

}
