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
public class PackageGroupService extends AbstractService {
    public PackageGroupService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<PackageGroup> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<PackageGroup> responseModel = (Class<PackageGroup>)(Class<?>)PackageGroup.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/package-groups", shopKey, countryCode), null, null, responseModel);
    }

    
    public ApiCollection<PackageGroup> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PackageGroup> responseModel = (Class<PackageGroup>)(Class<?>)PackageGroup.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/package-groups", shopKey, countryCode), query, null, responseModel);
    }

    
    public void assignPackageGroupToWarehouses(String shopKey, String countryCode, Integer packageGroupId, List<PackageGroupWarehouse> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), null, null, null, model);
    }

    
    public void assignPackageGroupToWarehouses(String shopKey, String countryCode, Integer packageGroupId, List<PackageGroupWarehouse> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), query, null, null, model);
    }

    
    public void replacePackageGroupForWarehouses(String shopKey, String countryCode, Integer packageGroupId, List<PackageGroupWarehouse> model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), null, null, null, model);
    }

    
    public void replacePackageGroupForWarehouses(String shopKey, String countryCode, Integer packageGroupId, List<PackageGroupWarehouse> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("put", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), query, null, null, model);
    }

    
    public void delete(String shopKey, String countryCode, Integer packageGroupId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), null, null, null);
    }

    
    public void delete(String shopKey, String countryCode, Integer packageGroupId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/package-groups/%s", shopKey, countryCode, packageGroupId), query, null, null);
    }

}
