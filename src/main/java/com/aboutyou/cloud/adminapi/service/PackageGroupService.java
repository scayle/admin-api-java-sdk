package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class PackageGroupService extends AbstractService {
    public PackageGroupService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<PackageGroup> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<PackageGroup> responseModel = (Class<PackageGroup>)(Class<?>)PackageGroup.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/package-groups", shopKey), null, responseModel);
    }

    public ApiCollection<PackageGroup> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PackageGroup> responseModel = (Class<PackageGroup>)(Class<?>)PackageGroup.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/package-groups", shopKey), options, responseModel);
    }

    public void assignPackageGroupToWarehouses(String shopKey, Integer packageGroupId, List<PackageGroupWarehouse> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), null, null, model);
    }

    public void assignPackageGroupToWarehouses(String shopKey, Integer packageGroupId, List<PackageGroupWarehouse> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), options, null, model);
    }

    public void replacePackageGroupForWarehouses(String shopKey, Integer packageGroupId, List<PackageGroupWarehouse> model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), null, null, model);
    }

    public void replacePackageGroupForWarehouses(String shopKey, Integer packageGroupId, List<PackageGroupWarehouse> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), options, null, model);
    }

    public void delete(String shopKey, Integer packageGroupId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), null, null);
    }

    public void delete(String shopKey, Integer packageGroupId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/package-groups/%s", shopKey, packageGroupId), options, null);
    }

}