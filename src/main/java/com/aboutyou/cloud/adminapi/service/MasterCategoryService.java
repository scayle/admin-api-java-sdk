package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class MasterCategoryService extends AbstractService {
    public MasterCategoryService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<MasterCategory> all() throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.requestCollection("get", this.resolvePath("/master-categories"), null, responseModel);
    }

    public ApiCollection<MasterCategory> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.requestCollection("get", this.resolvePath("/master-categories"), options, responseModel);
    }

}