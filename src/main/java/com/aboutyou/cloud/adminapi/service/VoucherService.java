package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class VoucherService extends AbstractService {
    public VoucherService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<Voucher> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/vouchers", shopKey, countryCode), null, responseModel);
    }

    public ApiCollection<Voucher> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/vouchers", shopKey, countryCode), options, responseModel);
    }

    public Voucher get(String shopKey, String countryCode, Integer voucherId) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), null, responseModel);
    }

    public Voucher get(String shopKey, String countryCode, Integer voucherId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), options, responseModel);
    }

    public Voucher create(String shopKey, String countryCode, Voucher model) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/vouchers", shopKey, countryCode), null, responseModel, model);
    }

    public Voucher create(String shopKey, String countryCode, Voucher model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/vouchers", shopKey, countryCode), options, responseModel, model);
    }

    public Voucher update(String shopKey, String countryCode, Integer voucherId, Voucher model) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), null, responseModel, model);
    }

    public Voucher update(String shopKey, String countryCode, Integer voucherId, Voucher model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Voucher> responseModel = (Class<Voucher>)(Class<?>)Voucher.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), options, responseModel, model);
    }

    public void delete(String shopKey, String countryCode, Integer voucherId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), null, null);
    }

    public void delete(String shopKey, String countryCode, Integer voucherId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/vouchers/%s", shopKey, countryCode, voucherId), options, null);
    }

    public ApiCollection<VoucherCriterion> getCriteria(String shopKey, String countryCode, Integer voucherId) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria", shopKey, countryCode, voucherId), null, responseModel);
    }

    public ApiCollection<VoucherCriterion> getCriteria(String shopKey, String countryCode, Integer voucherId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria", shopKey, countryCode, voucherId), options, responseModel);
    }

    public VoucherCriterion getCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), null, responseModel);
    }

    public VoucherCriterion getCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), options, responseModel);
    }

    public VoucherCriterion createCriterion(String shopKey, String countryCode, Integer voucherId, VoucherCriterion model) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria", shopKey, countryCode, voucherId), null, responseModel, model);
    }

    public VoucherCriterion createCriterion(String shopKey, String countryCode, Integer voucherId, VoucherCriterion model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria", shopKey, countryCode, voucherId), options, responseModel, model);
    }

    public VoucherCriterion updateCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId, VoucherCriterion model) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), null, responseModel, model);
    }

    public VoucherCriterion updateCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId, VoucherCriterion model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VoucherCriterion> responseModel = (Class<VoucherCriterion>)(Class<?>)VoucherCriterion.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), options, responseModel, model);
    }

    public void deleteCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), null, null);
    }

    public void deleteCriterion(String shopKey, String countryCode, Integer voucherId, Integer voucherCriterionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/vouchers/%s/criteria/%s", shopKey, countryCode, voucherId, voucherCriterionId), options, null);
    }

}