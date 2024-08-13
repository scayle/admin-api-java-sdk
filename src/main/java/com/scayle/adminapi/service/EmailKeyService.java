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
public class EmailKeyService extends AbstractService {
    public EmailKeyService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public EmailKey create(String shopKey, String countryCode, EmailKey model) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/emails/keys", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public EmailKey create(String shopKey, String countryCode, EmailKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/emails/keys", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public EmailKey update(String shopKey, String countryCode, Integer emailKeyId, EmailKey model) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), null, null, responseModel, model);
    }

    
    public EmailKey update(String shopKey, String countryCode, Integer emailKeyId, EmailKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, String countryCode, Integer emailKeyId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), null, null, null);
    }

    
    public void delete(String shopKey, String countryCode, Integer emailKeyId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), query, null, null);
    }

    
    public EmailKey get(String shopKey, String countryCode, Integer emailKeyId) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), null, null, responseModel);
    }

    
    public EmailKey get(String shopKey, String countryCode, Integer emailKeyId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/emails/keys/%s", shopKey, countryCode, emailKeyId), query, null, responseModel);
    }

    
    public ApiCollection<EmailKey> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/emails/keys", shopKey, countryCode), null, null, responseModel);
    }

    
    public ApiCollection<EmailKey> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<EmailKey> responseModel = (Class<EmailKey>)(Class<?>)EmailKey.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/emails/keys", shopKey, countryCode), query, null, responseModel);
    }

}
