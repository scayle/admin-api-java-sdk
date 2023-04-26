package com.aboutyou.cloud.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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

    public ApiCollection<Customer> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), null, null, responseModel);
    }

    public ApiCollection<Customer> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), query, null, responseModel);
    }

    public Customer get(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), null, null, responseModel);
    }

    public Customer get(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), query, null, responseModel);
    }

    public Customer create(String shopKey, String countryCode, Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), null, null, responseModel, model);
    }

    public Customer create(String shopKey, String countryCode, Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers", shopKey, countryCode), query, null, responseModel, model);
    }

    public Customer update(String shopKey, String countryCode, Identifier customerIdentifier, Customer model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), null, null, responseModel, model);
    }

    public Customer update(String shopKey, String countryCode, Identifier customerIdentifier, Customer model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s", shopKey, countryCode, customerIdentifier), query, null, responseModel, model);
    }

    public Customer updateReferenceKey(String shopKey, String countryCode, Integer customerId, CustomerReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/reference-key", shopKey, countryCode, customerId), null, null, responseModel, model);
    }

    public Customer updateReferenceKey(String shopKey, String countryCode, Integer customerId, CustomerReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/reference-key", shopKey, countryCode, customerId), query, null, responseModel, model);
    }

    public void anonymize(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/anonymize", shopKey, countryCode, customerIdentifier), null, null, null);
    }

    public void anonymize(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/anonymize", shopKey, countryCode, customerIdentifier), query, null, null);
    }

    public CustomerStatus getStatus(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), null, null, responseModel);
    }

    public CustomerStatus getStatus(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), query, null, responseModel);
    }

    public CustomerStatus updateStatus(String shopKey, String countryCode, Identifier customerIdentifier, CustomerStatus model) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), null, null, responseModel, model);
    }

    public CustomerStatus updateStatus(String shopKey, String countryCode, Identifier customerIdentifier, CustomerStatus model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerStatus> responseModel = (Class<CustomerStatus>)(Class<?>)CustomerStatus.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/status", shopKey, countryCode, customerIdentifier), query, null, responseModel, model);
    }

    public ApiCollection<CustomerAddress> getAddresses(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), null, null, responseModel);
    }

    public ApiCollection<CustomerAddress> getAddresses(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), query, null, responseModel);
    }

    public CustomerAddress getAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), null, null, responseModel);
    }

    public CustomerAddress getAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), query, null, responseModel);
    }

    public CustomerAddress createAddress(String shopKey, String countryCode, Identifier customerIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), null, null, responseModel, model);
    }

    public CustomerAddress createAddress(String shopKey, String countryCode, Identifier customerIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses", shopKey, countryCode, customerIdentifier), query, null, responseModel, model);
    }

    public CustomerAddress updateAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), null, null, responseModel, model);
    }

    public CustomerAddress updateAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, CustomerAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s", shopKey, countryCode, customerIdentifier, addressIdentifier), query, null, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(String shopKey, String countryCode, Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/reference-key", shopKey, countryCode, customerIdentifier, addressId), null, null, responseModel, model);
    }

    public CustomerAddress updateAddressReferenceKey(String shopKey, String countryCode, Identifier customerIdentifier, Integer addressId, CustomerAddressReferenceKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerAddress> responseModel = (Class<CustomerAddress>)(Class<?>)CustomerAddress.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/reference-key", shopKey, countryCode, customerIdentifier, addressId), query, null, responseModel, model);
    }

    public void anonymizeAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/anonymize", shopKey, countryCode, customerIdentifier, addressIdentifier), null, null, null);
    }

    public void anonymizeAddress(String shopKey, String countryCode, Identifier customerIdentifier, Identifier addressIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/addresses/%s/anonymize", shopKey, countryCode, customerIdentifier, addressIdentifier), query, null, null);
    }

    public void resetPassword(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/send-reset-password-email", shopKey, countryCode, customerIdentifier), null, null, null);
    }

    public void resetPassword(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/send-reset-password-email", shopKey, countryCode, customerIdentifier), query, null, null);
    }

    public Customer addGroups(String shopKey, String countryCode, Identifier customerId, CustomerGroup model) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/customer-groups", shopKey, countryCode, customerId), null, null, responseModel, model);
    }

    public Customer addGroups(String shopKey, String countryCode, Identifier customerId, CustomerGroup model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Customer> responseModel = (Class<Customer>)(Class<?>)Customer.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/customer-groups", shopKey, countryCode, customerId), query, null, responseModel, model);
    }

    public CustomerMembership createMembership(String shopKey, String countryCode, Identifier customerIdentifier, CustomerMembership model) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/memberships", shopKey, countryCode, customerIdentifier), null, null, responseModel, model);
    }

    public CustomerMembership createMembership(String shopKey, String countryCode, Identifier customerIdentifier, CustomerMembership model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customers/%s/memberships", shopKey, countryCode, customerIdentifier), query, null, responseModel, model);
    }

    public CustomerMembership updateMembership(String shopKey, String countryCode, Integer membershipId, CustomerMembership model) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/memberships/%s", shopKey, countryCode, membershipId), null, null, responseModel, model);
    }

    public CustomerMembership updateMembership(String shopKey, String countryCode, Integer membershipId, CustomerMembership model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/customers/memberships/%s", shopKey, countryCode, membershipId), query, null, responseModel, model);
    }

    public ApiCollection<CustomerMembership> getMemberships(String shopKey, String countryCode, Identifier customerIdentifier) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/memberships", shopKey, countryCode, customerIdentifier), null, null, responseModel);
    }

    public ApiCollection<CustomerMembership> getMemberships(String shopKey, String countryCode, Identifier customerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerMembership> responseModel = (Class<CustomerMembership>)(Class<?>)CustomerMembership.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customers/%s/memberships", shopKey, countryCode, customerIdentifier), query, null, responseModel);
    }

    public void deleteMembership(String shopKey, String countryCode, Integer membershipId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/memberships/%s", shopKey, countryCode, membershipId), null, null, null);
    }

    public void deleteMembership(String shopKey, String countryCode, Integer membershipId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/memberships/%s", shopKey, countryCode, membershipId), query, null, null);
    }

    public void deleteGroup(String shopKey, String countryCode, Identifier customerIdentifier, String customerGroup) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/customer-groups/%s", shopKey, countryCode, customerIdentifier, customerGroup), null, null, null);
    }

    public void deleteGroup(String shopKey, String countryCode, Identifier customerIdentifier, String customerGroup, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customers/%s/customer-groups/%s", shopKey, countryCode, customerIdentifier, customerGroup), query, null, null);
    }

}
