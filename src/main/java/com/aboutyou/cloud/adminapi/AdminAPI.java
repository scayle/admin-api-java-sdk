package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.ApiConfiguration;
import com.aboutyou.cloud.adminapi.service.ProductService;
import com.aboutyou.cloud.adminapi.service.ProductImageService;
import com.aboutyou.cloud.adminapi.service.ProductVariantService;
import com.aboutyou.cloud.adminapi.service.ProductVariantPriceService;
import com.aboutyou.cloud.adminapi.service.AttributeTranslationService;
import com.aboutyou.cloud.adminapi.service.ProductVariantStockService;
import com.aboutyou.cloud.adminapi.service.ShopService;
import com.aboutyou.cloud.adminapi.service.ShopPropertyKeyService;
import com.aboutyou.cloud.adminapi.service.AttributeGroupService;
import com.aboutyou.cloud.adminapi.service.CampaignService;
import com.aboutyou.cloud.adminapi.service.MasterCategoryService;
import com.aboutyou.cloud.adminapi.service.ShopCategoryService;
import com.aboutyou.cloud.adminapi.service.ShopCategoryPropertyKeyService;
import com.aboutyou.cloud.adminapi.service.ShopCountryService;
import com.aboutyou.cloud.adminapi.service.BrandService;
import com.aboutyou.cloud.adminapi.service.ProductSortingService;
import com.aboutyou.cloud.adminapi.service.ShopWarehouseService;
import com.aboutyou.cloud.adminapi.service.PackageGroupService;

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

    public ShopPropertyKeyService shopPropertyKeys() {
        ShopPropertyKeyService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopPropertyKeyService");
        return service;
    }

    public AttributeGroupService attributeGroups() {
        AttributeGroupService service = this.getService("com.aboutyou.cloud.adminapi.service.AttributeGroupService");
        return service;
    }

    public CampaignService campaigns() {
        CampaignService service = this.getService("com.aboutyou.cloud.adminapi.service.CampaignService");
        return service;
    }

    public MasterCategoryService masterCategories() {
        MasterCategoryService service = this.getService("com.aboutyou.cloud.adminapi.service.MasterCategoryService");
        return service;
    }

    public ShopCategoryService shopCategories() {
        ShopCategoryService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopCategoryService");
        return service;
    }

    public ShopCategoryPropertyKeyService shopCategoryPropertyKeys() {
        ShopCategoryPropertyKeyService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopCategoryPropertyKeyService");
        return service;
    }

    public ShopCountryService shopCountries() {
        ShopCountryService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopCountryService");
        return service;
    }

    public BrandService brands() {
        BrandService service = this.getService("com.aboutyou.cloud.adminapi.service.BrandService");
        return service;
    }

    public ProductSortingService productSortings() {
        ProductSortingService service = this.getService("com.aboutyou.cloud.adminapi.service.ProductSortingService");
        return service;
    }

    public ShopWarehouseService shopWarehouses() {
        ShopWarehouseService service = this.getService("com.aboutyou.cloud.adminapi.service.ShopWarehouseService");
        return service;
    }

    public PackageGroupService packageGroups() {
        PackageGroupService service = this.getService("com.aboutyou.cloud.adminapi.service.PackageGroupService");
        return service;
    }

}