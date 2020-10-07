package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.ApiConfiguration;
import com.aboutyou.cloud.adminapi.service.ProductService;
import com.aboutyou.cloud.adminapi.service.ProductImageService;
import com.aboutyou.cloud.adminapi.service.ProductVariantService;
import com.aboutyou.cloud.adminapi.service.ProductVariantPriceService;
import com.aboutyou.cloud.adminapi.service.AttributeTranslationService;
import com.aboutyou.cloud.adminapi.service.ProductVariantStockService;
import com.aboutyou.cloud.adminapi.service.ShopService;

public final class AdminAPI extends AbstractApiClient {

    public AdminAPI(ApiConfiguration apiConfiguration) {
        super(apiConfiguration);
    }

    public ProductService products() {
        ProductService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductService");
        return service;
    }

    public ProductImageService productImages() {
        ProductImageService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductImageService");
        return service;
    }

    public ProductVariantService productVariants() {
        ProductVariantService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductVariantService");
        return service;
    }

    public ProductVariantPriceService productVariantPrices() {
        ProductVariantPriceService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductVariantPriceService");
        return service;
    }

    public AttributeTranslationService attributeTranslations() {
        AttributeTranslationService service = this.getService("com.aboutyou.cloud.adminapi.service.AttributeTranslationService");
        return service;
    }

    public ProductVariantStockService productVariantStocks() {
        ProductVariantStockService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductVariantStockService");
        return service;
    }

    public ShopService shops() {
        ShopService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopService");
        return service;
    }

}