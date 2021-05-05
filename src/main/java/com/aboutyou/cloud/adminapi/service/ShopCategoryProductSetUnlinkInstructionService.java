package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopCategoryProductSetUnlinkInstructionService extends AbstractService {
    public ShopCategoryProductSetUnlinkInstructionService(HttpClient httpClient) {
        super(httpClient);
    }

    public void unlink(String shopKey, Integer productSetId, ShopCategoryProductSetUnlinkInstruction model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/product-sets/%s/unlink", shopKey, productSetId), null, null, model);
    }

    public void unlink(String shopKey, Integer productSetId, ShopCategoryProductSetUnlinkInstruction model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/product-sets/%s/unlink", shopKey, productSetId), options, null, model);
    }

}