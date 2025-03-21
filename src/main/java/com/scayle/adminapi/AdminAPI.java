package com.scayle.adminapi;

import com.scayle.adminapi.model.ApiConfiguration;
import com.scayle.adminapi.service.ProductService;
import com.scayle.adminapi.service.ProductsFirstLiveAtService;
import com.scayle.adminapi.service.MasterService;
import com.scayle.adminapi.service.ProductImageService;
import com.scayle.adminapi.service.ProductVariantService;
import com.scayle.adminapi.service.ProductVariantPriceService;
import com.scayle.adminapi.service.AttributeTranslationService;
import com.scayle.adminapi.service.ProductVariantStockService;
import com.scayle.adminapi.service.SellableWithoutStockService;
import com.scayle.adminapi.service.ShopService;
import com.scayle.adminapi.service.AttributeGroupService;
import com.scayle.adminapi.service.CampaignService;
import com.scayle.adminapi.service.MasterCategoryService;
import com.scayle.adminapi.service.ShopCategoryService;
import com.scayle.adminapi.service.ShopCategoryPropertyKeyService;
import com.scayle.adminapi.service.ShopCategoryProductSetUnlinkInstructionService;
import com.scayle.adminapi.service.ShopCountryService;
import com.scayle.adminapi.service.BrandService;
import com.scayle.adminapi.service.ProductSortingService;
import com.scayle.adminapi.service.ShopCountryWarehouseService;
import com.scayle.adminapi.service.ShopCountryPriceRoundingService;
import com.scayle.adminapi.service.PackageGroupService;
import com.scayle.adminapi.service.CustomDataConfigService;
import com.scayle.adminapi.service.CustomerService;
import com.scayle.adminapi.service.OrderService;
import com.scayle.adminapi.service.OrderItemService;
import com.scayle.adminapi.service.ShipmentService;
import com.scayle.adminapi.service.WebhookEventService;
import com.scayle.adminapi.service.WebhookSubscriptionService;
import com.scayle.adminapi.service.CancellationService;
import com.scayle.adminapi.service.ReturnItemService;
import com.scayle.adminapi.service.VoucherService;
import com.scayle.adminapi.service.CompanyService;
import com.scayle.adminapi.service.AssetService;
import com.scayle.adminapi.service.CarrierService;
import com.scayle.adminapi.service.MerchantService;
import com.scayle.adminapi.service.WarehouseService;
import com.scayle.adminapi.service.PromotionCodesService;
import com.scayle.adminapi.service.PromotionItemSetService;
import com.scayle.adminapi.service.PromotionV1Service;
import com.scayle.adminapi.service.PromotionService;
import com.scayle.adminapi.service.AudienceService;
import com.scayle.adminapi.service.ReservationService;
import com.scayle.adminapi.service.RedirectService;
import com.scayle.adminapi.service.EmailKeyService;
import com.scayle.adminapi.service.EmailService;
import com.scayle.adminapi.service.BulkRequestService;
import com.scayle.adminapi.service.BulkRequestStatusService;
import com.scayle.adminapi.service.BulkOperationStatusService;
import com.scayle.adminapi.service.ProductSellableTimeframeService;

public final class AdminAPI extends AbstractApiClient {

    public AdminAPI(ApiConfiguration apiConfiguration) {
        super(apiConfiguration);
    }

    public ProductService products() {
        ProductService service = this.getService("com.scayle.adminapi.service.ProductService");
        return service;
    }

    public ProductsFirstLiveAtService productsFirstLiveAts() {
        ProductsFirstLiveAtService service = this.getService("com.scayle.adminapi.service.ProductsFirstLiveAtService");
        return service;
    }

    public MasterService masters() {
        MasterService service = this.getService("com.scayle.adminapi.service.MasterService");
        return service;
    }

    public ProductImageService productImages() {
        ProductImageService service = this.getService("com.scayle.adminapi.service.ProductImageService");
        return service;
    }

    public ProductVariantService productVariants() {
        ProductVariantService service = this.getService("com.scayle.adminapi.service.ProductVariantService");
        return service;
    }

    public ProductVariantPriceService productVariantPrices() {
        ProductVariantPriceService service = this.getService("com.scayle.adminapi.service.ProductVariantPriceService");
        return service;
    }

    public AttributeTranslationService attributeTranslations() {
        AttributeTranslationService service = this.getService("com.scayle.adminapi.service.AttributeTranslationService");
        return service;
    }

    public ProductVariantStockService productVariantStocks() {
        ProductVariantStockService service = this.getService("com.scayle.adminapi.service.ProductVariantStockService");
        return service;
    }

    public SellableWithoutStockService sellableWithoutStocks() {
        SellableWithoutStockService service = this.getService("com.scayle.adminapi.service.SellableWithoutStockService");
        return service;
    }

    public ShopService shops() {
        ShopService service = this.getService("com.scayle.adminapi.service.ShopService");
        return service;
    }

    public AttributeGroupService attributeGroups() {
        AttributeGroupService service = this.getService("com.scayle.adminapi.service.AttributeGroupService");
        return service;
    }

    public CampaignService campaigns() {
        CampaignService service = this.getService("com.scayle.adminapi.service.CampaignService");
        return service;
    }

    public MasterCategoryService masterCategories() {
        MasterCategoryService service = this.getService("com.scayle.adminapi.service.MasterCategoryService");
        return service;
    }

    public ShopCategoryService shopCategories() {
        ShopCategoryService service = this.getService("com.scayle.adminapi.service.ShopCategoryService");
        return service;
    }

    public ShopCategoryPropertyKeyService shopCategoryPropertyKeys() {
        ShopCategoryPropertyKeyService service = this.getService("com.scayle.adminapi.service.ShopCategoryPropertyKeyService");
        return service;
    }

    public ShopCategoryProductSetUnlinkInstructionService shopCategoryProductSetUnlinkInstructions() {
        ShopCategoryProductSetUnlinkInstructionService service = this.getService("com.scayle.adminapi.service.ShopCategoryProductSetUnlinkInstructionService");
        return service;
    }

    public ShopCountryService shopCountries() {
        ShopCountryService service = this.getService("com.scayle.adminapi.service.ShopCountryService");
        return service;
    }

    public BrandService brands() {
        BrandService service = this.getService("com.scayle.adminapi.service.BrandService");
        return service;
    }

    public ProductSortingService productSortings() {
        ProductSortingService service = this.getService("com.scayle.adminapi.service.ProductSortingService");
        return service;
    }

    public ShopCountryWarehouseService shopCountryWarehouses() {
        ShopCountryWarehouseService service = this.getService("com.scayle.adminapi.service.ShopCountryWarehouseService");
        return service;
    }

    public ShopCountryPriceRoundingService shopCountryPriceRoundings() {
        ShopCountryPriceRoundingService service = this.getService("com.scayle.adminapi.service.ShopCountryPriceRoundingService");
        return service;
    }

    public PackageGroupService packageGroups() {
        PackageGroupService service = this.getService("com.scayle.adminapi.service.PackageGroupService");
        return service;
    }

    public CustomDataConfigService customDataConfigs() {
        CustomDataConfigService service = this.getService("com.scayle.adminapi.service.CustomDataConfigService");
        return service;
    }

    public CustomerService customers() {
        CustomerService service = this.getService("com.scayle.adminapi.service.CustomerService");
        return service;
    }

    public OrderService orders() {
        OrderService service = this.getService("com.scayle.adminapi.service.OrderService");
        return service;
    }

    public OrderItemService orderItems() {
        OrderItemService service = this.getService("com.scayle.adminapi.service.OrderItemService");
        return service;
    }

    public ShipmentService shipments() {
        ShipmentService service = this.getService("com.scayle.adminapi.service.ShipmentService");
        return service;
    }

    public WebhookEventService webhookEvents() {
        WebhookEventService service = this.getService("com.scayle.adminapi.service.WebhookEventService");
        return service;
    }

    public WebhookSubscriptionService webhookSubscriptions() {
        WebhookSubscriptionService service = this.getService("com.scayle.adminapi.service.WebhookSubscriptionService");
        return service;
    }

    public CancellationService cancellations() {
        CancellationService service = this.getService("com.scayle.adminapi.service.CancellationService");
        return service;
    }

    public ReturnItemService returnItems() {
        ReturnItemService service = this.getService("com.scayle.adminapi.service.ReturnItemService");
        return service;
    }

    public VoucherService vouchers() {
        VoucherService service = this.getService("com.scayle.adminapi.service.VoucherService");
        return service;
    }

    public CompanyService companies() {
        CompanyService service = this.getService("com.scayle.adminapi.service.CompanyService");
        return service;
    }

    public AssetService assets() {
        AssetService service = this.getService("com.scayle.adminapi.service.AssetService");
        return service;
    }

    public CarrierService carriers() {
        CarrierService service = this.getService("com.scayle.adminapi.service.CarrierService");
        return service;
    }

    public MerchantService merchants() {
        MerchantService service = this.getService("com.scayle.adminapi.service.MerchantService");
        return service;
    }

    public WarehouseService warehouses() {
        WarehouseService service = this.getService("com.scayle.adminapi.service.WarehouseService");
        return service;
    }

    public PromotionCodesService promotionCodess() {
        PromotionCodesService service = this.getService("com.scayle.adminapi.service.PromotionCodesService");
        return service;
    }

    public PromotionItemSetService promotionItemSets() {
        PromotionItemSetService service = this.getService("com.scayle.adminapi.service.PromotionItemSetService");
        return service;
    }

    public PromotionV1Service promotionV1s() {
        PromotionV1Service service = this.getService("com.scayle.adminapi.service.PromotionV1Service");
        return service;
    }

    public PromotionService promotions() {
        PromotionService service = this.getService("com.scayle.adminapi.service.PromotionService");
        return service;
    }

    public AudienceService audiences() {
        AudienceService service = this.getService("com.scayle.adminapi.service.AudienceService");
        return service;
    }

    public ReservationService reservations() {
        ReservationService service = this.getService("com.scayle.adminapi.service.ReservationService");
        return service;
    }

    public RedirectService redirects() {
        RedirectService service = this.getService("com.scayle.adminapi.service.RedirectService");
        return service;
    }

    public EmailKeyService emailKeys() {
        EmailKeyService service = this.getService("com.scayle.adminapi.service.EmailKeyService");
        return service;
    }

    public EmailService emails() {
        EmailService service = this.getService("com.scayle.adminapi.service.EmailService");
        return service;
    }

    public BulkRequestService bulkRequests() {
        BulkRequestService service = this.getService("com.scayle.adminapi.service.BulkRequestService");
        return service;
    }

    public BulkRequestStatusService bulkRequestStatuses() {
        BulkRequestStatusService service = this.getService("com.scayle.adminapi.service.BulkRequestStatusService");
        return service;
    }

    public BulkOperationStatusService bulkOperationStatuses() {
        BulkOperationStatusService service = this.getService("com.scayle.adminapi.service.BulkOperationStatusService");
        return service;
    }

    public ProductSellableTimeframeService productSellableTimeframes() {
        ProductSellableTimeframeService service = this.getService("com.scayle.adminapi.service.ProductSellableTimeframeService");
        return service;
    }

}