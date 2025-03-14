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
public class OrderItemService extends AbstractService {
    public OrderItemService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public OrderItem createOrUpdateLegacyCustomData(String shopKey, String countryCode, Integer orderId, Integer orderItemId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<OrderItem> responseModel = (Class<OrderItem>)(Class<?>)OrderItem.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/items/%s/legacy-custom-data", shopKey, countryCode, orderId, orderItemId), null, null, responseModel, model);
    }

    
    public OrderItem createOrUpdateLegacyCustomData(String shopKey, String countryCode, Integer orderId, Integer orderItemId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<OrderItem> responseModel = (Class<OrderItem>)(Class<?>)OrderItem.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/items/%s/legacy-custom-data", shopKey, countryCode, orderId, orderItemId), query, null, responseModel, model);
    }

}
