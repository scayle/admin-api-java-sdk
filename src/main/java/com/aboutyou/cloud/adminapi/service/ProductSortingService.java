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
public class ProductSortingService extends AbstractService {
    public ProductSortingService(HttpClient httpClient) {
        super(httpClient);
    }

    public void updateOrCreate(List<ProductSorting> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/product-sortings"), null, null, null, model);
    }

    public void updateOrCreate(List<ProductSorting> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/product-sortings"), query, null, null, model);
    }

}
