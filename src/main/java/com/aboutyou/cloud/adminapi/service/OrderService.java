package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class OrderService extends AbstractService {
    public OrderService(HttpClient httpClient) {
        super(httpClient);
    }

    public Order get(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), null, responseModel);
    }

    public Order get(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), options, responseModel);
    }

    public Order updateReferenceKey(String shopKey, String countryCode, Integer orderId, OrderReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/reference-key", shopKey, countryCode, orderId), null, responseModel, model);
    }

    public Order updateReferenceKey(String shopKey, String countryCode, Integer orderId, OrderReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/reference-key", shopKey, countryCode, orderId), options, responseModel, model);
    }

    public OrderStatus getStatus(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {
        Class<OrderStatus> responseModel = (Class<OrderStatus>)(Class<?>)OrderStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/status", shopKey, countryCode, orderIdentifier), null, responseModel);
    }

    public OrderStatus getStatus(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<OrderStatus> responseModel = (Class<OrderStatus>)(Class<?>)OrderStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/status", shopKey, countryCode, orderIdentifier), options, responseModel);
    }

}