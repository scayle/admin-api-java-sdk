package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderFee extends AbstractModel  {
    /**
    * If the order has an external price, this field becomes optional.
    */
    @SerializedName("amount")
    OrderFeeAmount amount;

    /**
    * Categorises the fee. Valid values in case of non-external orders:
  - `payment`
  - `percentage_payment`
  - `delivery`
  - `shipment`
  - `return`
  - `additional`
  - `conditional`

If the order has an external price, this field becomes optional and can contain any string value defined by the client.

    */
    @SerializedName("category")
    String category;

    /**
    * Identifies the specific fee within its `category`. Valid values in case of non-external orders:
  - `base_payment_service_cost`
  - `deferred_payment_service_cost`
  - `instalment_payment_service_cost`
  - `custom_payment_service_cost`
  - `base_shipping_service_cost`
  - `express_shipping_service_cost`
  - `yearly_interest_rate`
  - `return_costs`
  - `not_refundable_cost`
  - `home_delivery_service_fee`

If the order has an external price, this field becomes optional and can contain any string value defined by the client.

    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("option")
    String option;

    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

    /**
    * Present on the webhook event in which the fee is being invoiced.
Consumers should treat these as event signals, not persistent state.

    */
    @SerializedName("invoiceTriggered")
    Boolean invoiceTriggered;

    /**
    * Present on the webhook event in which the fee is being refunded.
Consumers should treat these as event signals, not persistent state.

    */
    @SerializedName("refundTriggered")
    Boolean refundTriggered;

}