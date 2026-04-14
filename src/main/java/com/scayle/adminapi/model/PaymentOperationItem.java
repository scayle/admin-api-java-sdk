package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PaymentOperationItem extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("brand")
    String brand;

    public void setBrand(String value) {
        if (value == null) {
            this.setNull("brand");
        }
        this.brand = value;
    }
    /**
    * 
    */
    @SerializedName("bruttoDiscount")
    Integer bruttoDiscount;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    public void setDescription(String value) {
        if (value == null) {
            this.setNull("description");
        }
        this.description = value;
    }
    /**
    * 
    */
    @SerializedName("descriptionAddition")
    String descriptionAddition;

    public void setDescriptionAddition(String value) {
        if (value == null) {
            this.setNull("descriptionAddition");
        }
        this.descriptionAddition = value;
    }
    /**
    * 
    */
    @SerializedName("merchantProductId")
    String merchantProductId;

    public void setMerchantProductId(String value) {
        if (value == null) {
            this.setNull("merchantProductId");
        }
        this.merchantProductId = value;
    }
    /**
    * 
    */
    @SerializedName("nettoPrice")
    Integer nettoPrice;

    /**
    * 
    */
    @SerializedName("orderProductId")
    Integer orderProductId;

    /**
    * 
    */
    @SerializedName("price")
    Integer price;

    /**
    * 
    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * 
    */
    @SerializedName("tax")
    Integer tax;

    /**
    * 
    */
    @SerializedName("undiscountedUnitPrice")
    Integer undiscountedUnitPrice;

    /**
    * 
    */
    @SerializedName("unitPrice")
    Integer unitPrice;

    /**
    * 
    */
    @SerializedName("unitPriceWithoutTaxWithVoucher")
    Integer unitPriceWithoutTaxWithVoucher;

    /**
    * 
    */
    @SerializedName("unitTaxValueWithVoucher")
    Integer unitTaxValueWithVoucher;

    /**
    * 
    */
    @SerializedName("variantId")
    Integer variantId;

    /**
    * 
    */
    @SerializedName("voucherCode")
    String voucherCode;

    public void setVoucherCode(String value) {
        if (value == null) {
            this.setNull("voucherCode");
        }
        this.voucherCode = value;
    }
}