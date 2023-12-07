package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionSchedule implements ApiObjectInterface {
    /**
    * The beginning of the time range when the promotion is active
    */
    @SerializedName("from")
    String from;

    /**
    * The end of the time range when the promotion is active
    */
    @SerializedName("to")
    String to;

}