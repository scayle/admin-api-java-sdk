package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ReturnItemService extends AbstractService {
    public ReturnItemService(HttpClient httpClient) {
        super(httpClient);
    }

    public void send(List<ReturnItem> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/return-items"), null, null, model);
    }

    public void send(List<ReturnItem> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/return-items"), options, null, model);
    }

}