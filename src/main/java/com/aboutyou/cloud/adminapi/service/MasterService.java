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
public class MasterService extends AbstractService {
    public MasterService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductMasterCategories updateProductMasterMasterCategories(Identifier productMasterIdentifier, ProductMasterCategories model) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        return this.request("put", this.resolvePath("/product-masters/%s/master-categories", productMasterIdentifier), null, null, responseModel, model);
    }

    public ProductMasterCategories updateProductMasterMasterCategories(Identifier productMasterIdentifier, ProductMasterCategories model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/product-masters/%s/master-categories", productMasterIdentifier), query, null, responseModel, model);
    }

}
