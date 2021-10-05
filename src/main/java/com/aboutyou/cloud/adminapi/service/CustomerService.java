package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class CustomerService extends AbstractService {
    public CustomerService(HttpClient httpClient) {
        super(httpClient);
    }

    public Customer get(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), null, responseModel);
    }

    public Customer get(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), options, responseModel);
    }

    public Customer create(String shopKey, String countryCode, Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), null, responseModel, model);
    }

    public Customer create(String shopKey, String countryCode, Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), options, responseModel, model);
    }

    public Customer update(String shopKey, String countryCode, Identifier customerIdentifier, Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), null, responseModel, model);
    }

    public Customer update(String shopKey, String countryCode, Identifier customerIdentifier, Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), options, responseModel, model);
    }

    public Customer updateReferenceKey(String shopKey, String countryCode, Integer customerId, CustomerReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/reference-key", shopKey, countryCode, customerId), null, responseModel, model);
    }

    public Customer updateReferenceKey(String shopKey, String countryCode, Integer customerId, CustomerReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/reference-key", shopKey, countryCode, customerId), options, responseModel, model);
    }

    public void anonymize(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/anonymize", shopKey, countryCode, customerIdentifier), null, null);
    }

    public void anonymize(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/anonymize", shopKey, countryCode, customerIdentifier), options, null);
    }

    public CustomerStatus getStatus(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), null, responseModel);
    }

    public CustomerStatus getStatus(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), options, responseModel);
    }

    public CustomerStatus updateStatus(String shopKey, String countryCode, Identifier customerIdentifier, CustomerStatus model) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), null, responseModel, model);
    }

    public CustomerStatus updateStatus(String shopKey, String countryCode, Identifier customerIdentifier, CustomerStatus model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), options, responseModel, model);
    }

    public ApiCollection<CustomerAddress> getAddresses(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), null, responseModel);
    }

    public ApiCollection<CustomerAddress> getAddresses(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), options, responseModel);
    }

    public CustomerAddress getAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), null, responseModel);
    }

    public CustomerAddress getAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), options, responseModel);
    }

    public CustomerAddress createAddress(String shopKey, String countryCode, Identifier customerIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), null, responseModel, model);
    }

    public CustomerAddress createAddress(String shopKey, String countryCode, Identifier customerIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), options, responseModel, model);
    }

    public CustomerAddress updateAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), null, responseModel, model);
    }

    public CustomerAddress updateAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), options, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(String shopKey, String countryCode, Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/reference-key", shopKey, countryCode, customerIdentifier, addressId), null, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(String shopKey, String countryCode, Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/reference-key", shopKey, countryCode, customerIdentifier, addressId), options, responseModel, model);
    }

    public void anonymizeAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/anonymize", shopKey, countryCode, customerIdentifier, addressIdentifier), null, null);
    }

    public void anonymizeAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/anonymize", shopKey, countryCode, customerIdentifier, addressIdentifier), options, null);
    }

    public void resetPassword(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/send-reset-password-email", shopKey, countryCode, customerIdentifier), null, null);
    }

    public void resetPassword(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/send-reset-password-email", shopKey, countryCode, customerIdentifier), options, null);
    }

}