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
public class OrderBillingStatusService extends AbstractService {
    public OrderBillingStatusService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public Order updateOrderBillingStatus(String shopKey, String countryCode, Identifier orderId, OrderBillingStatus model) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/orders/%s/billing-status", shopKey, countryCode, orderId), null, null, responseModel, model);
    }

    
    public Order updateOrderBillingStatus(String shopKey, String countryCode, Identifier orderId, OrderBillingStatus model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/orders/%s/billing-status", shopKey, countryCode, orderId), query, null, responseModel, model);
    }

}
