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

    public Customer get(Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("get", this.resolvePath("/customers/%s", customerIdentifier), null, responseModel);
    }

    public Customer get(Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("get", this.resolvePath("/customers/%s", customerIdentifier), options, responseModel);
    }

    public Customer create(Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/customers"), null, responseModel, model);
    }

    public Customer create(Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/customers"), options, responseModel, model);
    }

    public Customer update(Identifier customerIdentifier, Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("patch", this.resolvePath("/customers/%s", customerIdentifier), null, responseModel, model);
    }

    public Customer update(Identifier customerIdentifier, Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("patch", this.resolvePath("/customers/%s", customerIdentifier), options, responseModel, model);
    }

    public Customer updateReferenceKey(Integer customerId, CustomerReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("put", this.resolvePath("/customers/%s/reference-key", customerId), null, responseModel, model);
    }

    public Customer updateReferenceKey(Integer customerId, CustomerReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("put", this.resolvePath("/customers/%s/reference-key", customerId), options, responseModel, model);
    }

    public void anonymize(Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/customers/%s/anonymize", customerIdentifier), null, null);
    }

    public void anonymize(Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/customers/%s/anonymize", customerIdentifier), options, null);
    }

    public CustomerStatus getStatus(Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("get", this.resolvePath("/customers/%s/status", customerIdentifier), null, responseModel);
    }

    public CustomerStatus getStatus(Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("get", this.resolvePath("/customers/%s/status", customerIdentifier), options, responseModel);
    }

    public CustomerStatus updateStatus(Identifier customerIdentifier, CustomerStatus model) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("put", this.resolvePath("/customers/%s/status", customerIdentifier), null, responseModel, model);
    }

    public CustomerStatus updateStatus(Identifier customerIdentifier, CustomerStatus model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("put", this.resolvePath("/customers/%s/status", customerIdentifier), options, responseModel, model);
    }

    public ApiCollection<CustomerAddress> getAddresses(Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.requestCollection("get", this.resolvePath("/customers/%s/addresses", customerIdentifier), null, responseModel);
    }

    public ApiCollection<CustomerAddress> getAddresses(Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.requestCollection("get", this.resolvePath("/customers/%s/addresses", customerIdentifier), options, responseModel);
    }

    public CustomerAddress getAddress(Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("get", this.resolvePath("/customers/%s/addresses/%s", customerIdentifier, addressIdentifier), null, responseModel);
    }

    public CustomerAddress getAddress(Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("get", this.resolvePath("/customers/%s/addresses/%s", customerIdentifier, addressIdentifier), options, responseModel);
    }

    public CustomerAddress createAddress(Identifier customerIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("post", this.resolvePath("/customers/%s/addresses", customerIdentifier), null, responseModel, model);
    }

    public CustomerAddress createAddress(Identifier customerIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("post", this.resolvePath("/customers/%s/addresses", customerIdentifier), options, responseModel, model);
    }

    public CustomerAddress updateAddress(Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/customers/%s/addresses/%s", customerIdentifier, addressIdentifier), null, responseModel, model);
    }

    public CustomerAddress updateAddress(Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/customers/%s/addresses/%s", customerIdentifier, addressIdentifier), options, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/customers/%s/addresses/%s/reference-key", customerIdentifier, addressId), null, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/customers/%s/addresses/%s/reference-key", customerIdentifier, addressId), options, responseModel, model);
    }

    public void anonymizeAddress(Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/customers/%s/addresses/%s/anonymize", customerIdentifier, addressIdentifier), null, null);
    }

    public void anonymizeAddress(Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/customers/%s/addresses/%s/anonymize", customerIdentifier, addressIdentifier), options, null);
    }

    public void resetPassword(Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/customers/%s/send-reset-password-email", customerIdentifier), null, null);
    }

    public void resetPassword(Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/customers/%s/send-reset-password-email", customerIdentifier), options, null);
    }

}