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
public class BulkRequestService extends AbstractService {
    public BulkRequestService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public BulkRequestStatus cancel(Integer requestKey) throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        return this.request("put", this.resolvePath("/bulk-requests/%s/cancel", requestKey), null, null, responseModel);
    }

    
    public BulkRequestStatus cancel(Integer requestKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequestStatus> responseModel = (Class<BulkRequestStatus>)(Class<?>)BulkRequestStatus.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/bulk-requests/%s/cancel", requestKey), query, null, responseModel);
    }

}
