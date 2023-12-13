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
public class ShopCountryPriceRoundingService extends AbstractService {
    public ShopCountryPriceRoundingService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<ShopCountryPriceRounding> all(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<ShopCountryPriceRounding> responseModel = (Class<ShopCountryPriceRounding>)(Class<?>)ShopCountryPriceRounding.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/price-roundings", shopKey, countryCode), null, null, responseModel);
    }

    
    public ApiCollection<ShopCountryPriceRounding> all(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountryPriceRounding> responseModel = (Class<ShopCountryPriceRounding>)(Class<?>)ShopCountryPriceRounding.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/price-roundings", shopKey, countryCode), query, null, responseModel);
    }

    
    public ShopCountryPriceRounding create(String shopKey, String countryCode, ShopCountryPriceRounding model) throws ApiErrorException, ConnectionException {
        Class<ShopCountryPriceRounding> responseModel = (Class<ShopCountryPriceRounding>)(Class<?>)ShopCountryPriceRounding.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/price-roundings", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public ShopCountryPriceRounding create(String shopKey, String countryCode, ShopCountryPriceRounding model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountryPriceRounding> responseModel = (Class<ShopCountryPriceRounding>)(Class<?>)ShopCountryPriceRounding.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/price-roundings", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, String countryCode, Integer priceRoundingId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/price-roundings/%s", shopKey, countryCode, priceRoundingId), null, null, null);
    }

    
    public void delete(String shopKey, String countryCode, Integer priceRoundingId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/price-roundings/%s", shopKey, countryCode, priceRoundingId), query, null, null);
    }

}
