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
public class OrderService extends AbstractService {
    public OrderService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public Order get(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), null, null, responseModel);
    }

    
    public Order get(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), query, null, responseModel);
    }

    
    public ApiCollection<Order> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/orders", shopKey, countryCode), null, null, responseModel);
    }

    
    public ApiCollection<Order> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/orders", shopKey, countryCode), query, null, responseModel);
    }

    
    public Order updateReferenceKey(String shopKey, String countryCode, Integer orderId, OrderReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/reference-key", shopKey, countryCode, orderId), null, null, responseModel, model);
    }

    
    public Order updateReferenceKey(String shopKey, String countryCode, Integer orderId, OrderReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/orders/%s/reference-key", shopKey, countryCode, orderId), query, null, responseModel, model);
    }

    
    public Order create(String shopKey, String countryCode, Order model) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/orders", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public Order create(String shopKey, String countryCode, Order model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/orders", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), null, null, null);
    }

    
    public void delete(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/orders/%s", shopKey, countryCode, orderIdentifier), query, null, null);
    }

    
    public OrderStatus getStatus(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {
        Class<OrderStatus> responseModel = (Class<OrderStatus>)(Class<?>)OrderStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/status", shopKey, countryCode, orderIdentifier), null, null, responseModel);
    }

    
    public OrderStatus getStatus(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<OrderStatus> responseModel = (Class<OrderStatus>)(Class<?>)OrderStatus.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/status", shopKey, countryCode, orderIdentifier), query, null, responseModel);
    }

    
    public Order createSubscriptionOrder(String shopKey, String countryCode, SubscriptionOrder model) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/orders/subscription-orders", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public Order createSubscriptionOrder(String shopKey, String countryCode, SubscriptionOrder model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Order> responseModel = (Class<Order>)(Class<?>)Order.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/orders/subscription-orders", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public ApiCollection<OrderInvoice> getOrderInvoices(String shopKey, String countryCode, Identifier orderIdentifier) throws ApiErrorException, ConnectionException {
        Class<OrderInvoice> responseModel = (Class<OrderInvoice>)(Class<?>)OrderInvoice.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/invoices", shopKey, countryCode, orderIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<OrderInvoice> getOrderInvoices(String shopKey, String countryCode, Identifier orderIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<OrderInvoice> responseModel = (Class<OrderInvoice>)(Class<?>)OrderInvoice.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/orders/%s/invoices", shopKey, countryCode, orderIdentifier), query, null, responseModel);
    }

}
