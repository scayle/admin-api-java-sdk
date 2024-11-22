package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductState extends AbstractModel  {
    /**
    * The state of the product determined by the state evaluation process. The only possible values to request are `live`, `draft` and `blocked`. The `problem` state can only be the result of the state evaluation process. If product is in problem state, the reasons are listed in read-only 'problems' field. The `new` and `inApproval` states can be set in the SCAYLE Panel. If a product belongs to multiple merchants, the state is returned based on the hierarchical order live, inApproval, problem, blocked, draft
    */
    @SerializedName("state")
    String state = "live";

    /**
    * A list of merchant reference keys the merchant product belongs to.
    */
    @SerializedName("merchantReferenceKeys")
    List<String> merchantReferenceKeys;

    /**
    * A list of merchant keys to which the merchant product belongs to and the state of the merchant product.
    */
    @SerializedName("merchantProductStates")
    List<MerchantProductState> merchantProductStates;

}