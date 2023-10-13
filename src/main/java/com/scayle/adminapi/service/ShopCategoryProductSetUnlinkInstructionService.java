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
public class ShopCategoryProductSetUnlinkInstructionService extends AbstractService {
    public ShopCategoryProductSetUnlinkInstructionService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void unlink(String shopKey, Integer productSetId, ShopCategoryProductSetUnlinkInstruction model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/shops/%s/product-sets/%s/unlink", shopKey, productSetId), null, null, null, model);
    }

    
    public void unlink(String shopKey, Integer productSetId, ShopCategoryProductSetUnlinkInstruction model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("put", this.resolvePath("/shops/%s/product-sets/%s/unlink", shopKey, productSetId), query, null, null, model);
    }

}
