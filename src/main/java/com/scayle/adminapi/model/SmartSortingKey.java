package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SmartSortingKey extends AbstractModel  {
    /**
    * Unique identifier of the smart sorting key.
    */
    @SerializedName("key")
    String key;

    /**
    * Optional description of the smart sorting key. Omitted in responses when null.
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
    * Whether this is a custom smart sorting key. Always false for system keys.
    */
    @SerializedName("isCustom")
    Boolean isCustom;

    /**
    * 
    */
    @SerializedName("weights")
    SmartSortingKeyWeights weights;

}