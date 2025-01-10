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
public class BulkOperationStatusService extends AbstractService {
    public BulkOperationStatusService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public BulkOperationStatus get(Integer requestKey, String operationKey) throws ApiErrorException, ConnectionException {
        Class<BulkOperationStatus> responseModel = (Class<BulkOperationStatus>)(Class<?>)BulkOperationStatus.class;

        return this.request("get", this.resolvePath("/bulk-requests/%s/operations/%s/status", requestKey, operationKey), null, null, responseModel);
    }

    
    public BulkOperationStatus get(Integer requestKey, String operationKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkOperationStatus> responseModel = (Class<BulkOperationStatus>)(Class<?>)BulkOperationStatus.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/bulk-requests/%s/operations/%s/status", requestKey, operationKey), query, null, responseModel);
    }

}
