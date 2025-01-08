package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderSubsequentDeliveryKey {
    @SerializedName("endOfJanuary")
    VALUE_ENDOFJANUARY("endOfJanuary"),

    @SerializedName("endOfFebruary")
    VALUE_ENDOFFEBRUARY("endOfFebruary"),

    @SerializedName("endOfMarch")
    VALUE_ENDOFMARCH("endOfMarch"),

    @SerializedName("endOfApril")
    VALUE_ENDOFAPRIL("endOfApril"),

    @SerializedName("endOfMay")
    VALUE_ENDOFMAY("endOfMay"),

    @SerializedName("endOfJune")
    VALUE_ENDOFJUNE("endOfJune"),

    @SerializedName("endOfJuly")
    VALUE_ENDOFJULY("endOfJuly"),

    @SerializedName("endOfAugust")
    VALUE_ENDOFAUGUST("endOfAugust"),

    @SerializedName("endOfSeptember")
    VALUE_ENDOFSEPTEMBER("endOfSeptember"),

    @SerializedName("endOfOctober")
    VALUE_ENDOFOCTOBER("endOfOctober"),

    @SerializedName("endOfNovember")
    VALUE_ENDOFNOVEMBER("endOfNovember"),

    @SerializedName("endOfDecember")
    VALUE_ENDOFDECEMBER("endOfDecember"),

    @SerializedName("midOfJanuary")
    VALUE_MIDOFJANUARY("midOfJanuary"),

    @SerializedName("midOfFebruary")
    VALUE_MIDOFFEBRUARY("midOfFebruary"),

    @SerializedName("midOfMarch")
    VALUE_MIDOFMARCH("midOfMarch"),

    @SerializedName("midOfApril")
    VALUE_MIDOFAPRIL("midOfApril"),

    @SerializedName("midOfMay")
    VALUE_MIDOFMAY("midOfMay"),

    @SerializedName("midOfJune")
    VALUE_MIDOFJUNE("midOfJune"),

    @SerializedName("midOfJuly")
    VALUE_MIDOFJULY("midOfJuly"),

    @SerializedName("midOfAugust")
    VALUE_MIDOFAUGUST("midOfAugust"),

    @SerializedName("midOfSeptember")
    VALUE_MIDOFSEPTEMBER("midOfSeptember"),

    @SerializedName("midOfOctober")
    VALUE_MIDOFOCTOBER("midOfOctober"),

    @SerializedName("midOfNovember")
    VALUE_MIDOFNOVEMBER("midOfNovember"),

    @SerializedName("midOfDecember")
    VALUE_MIDOFDECEMBER("midOfDecember"),

    @SerializedName("easter")
    VALUE_EASTER("easter"),

    @SerializedName("christmas")
    VALUE_CHRISTMAS("christmas"),

    @SerializedName("available")
    VALUE_AVAILABLE("available"),

    @SerializedName("directShipping")
    VALUE_DIRECTSHIPPING("directShipping"),

    @SerializedName("outsol")
    VALUE_OUTSOL("outsol");


    private final String val;

    OrderSubsequentDeliveryKey(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}