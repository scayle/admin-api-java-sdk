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
public class BulkRequestStatusService extends AbstractService {
    public BulkRequestStatusService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<BulkRequestStatus> all() throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        return this.requestCollection("get", this.resolvePath("/bulk-requests"), null, null, responseModel);
    }

    
    public ApiCollection<BulkRequestStatus> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/bulk-requests"), query, null, responseModel);
    }

    
    public BulkRequestStatus get(Integer requestKey) throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        return this.request("get", this.resolvePath("/bulk-requests/%s/status", requestKey), null, null, responseModel);
    }

    
    public BulkRequestStatus get(Integer requestKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/bulk-requests/%s/status", requestKey), query, null, responseModel);
    }

}
