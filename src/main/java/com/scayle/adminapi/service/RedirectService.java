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
public class RedirectService extends AbstractService {
    public RedirectService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Redirect> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/redirects", shopKey), null, null, responseModel);
    }

    
    public ApiCollection<Redirect> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/redirects", shopKey), query, null, responseModel);
    }

}
