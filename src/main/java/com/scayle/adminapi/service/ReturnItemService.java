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
public class ReturnItemService extends AbstractService {
    public ReturnItemService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void send(List<ReturnItem> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/return-items"), null, null, null, model);
    }

    
    public void send(List<ReturnItem> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.except(Arrays.asList("companyId"));

        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("X-Company-Id", options.get("companyId"));

        this.request("post", this.resolvePath("/fulfillment/return-items"), query, headers, null, model);
    }

}
