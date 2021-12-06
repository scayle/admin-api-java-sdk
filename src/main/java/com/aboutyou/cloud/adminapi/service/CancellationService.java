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
public class CancellationService extends AbstractService {
    public CancellationService(HttpClient httpClient) {
        super(httpClient);
    }

    public void send(Cancellation model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/cancellations"), null, null, null, model);
    }

    public void send(Cancellation model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.except(Arrays.asList("companyId"));

        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("X-Company-Id", options.get("companyId"));

        this.request("post", this.resolvePath("/fulfillment/cancellations"), query, headers, null, model);
    }

}
