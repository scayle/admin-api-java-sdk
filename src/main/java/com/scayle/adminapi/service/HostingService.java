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
public class HostingService extends AbstractService {
    public HostingService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void purgeCdnCacheForAllUrls(String shopKey, String envKey, PurgeAllRequest model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/hosting/shops/%s/environments/%s/purge-cdn-cache", shopKey, envKey), null, null, null, model);
    }

    
    public void purgeCdnCacheForAllUrls(String shopKey, String envKey, PurgeAllRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/hosting/shops/%s/environments/%s/purge-cdn-cache", shopKey, envKey), query, null, null, model);
    }

    
    public void purgeCdnCacheForUrlPrefixes(String shopKey, String envKey, PurgeUrlPrefixesRequest model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/hosting/shops/%s/environments/%s/purge-cdn-cache", shopKey, envKey), null, null, null, model);
    }

    
    public void purgeCdnCacheForUrlPrefixes(String shopKey, String envKey, PurgeUrlPrefixesRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/hosting/shops/%s/environments/%s/purge-cdn-cache", shopKey, envKey), query, null, null, model);
    }

}
