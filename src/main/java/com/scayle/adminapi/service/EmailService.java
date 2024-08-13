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
public class EmailService extends AbstractService {
    public EmailService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void send(String shopKey, String countryCode, Email model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/countries/%s/emails/send", shopKey, countryCode), null, null, null, model);
    }

    
    public void send(String shopKey, String countryCode, Email model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/shops/%s/countries/%s/emails/send", shopKey, countryCode), query, null, null, model);
    }

}
