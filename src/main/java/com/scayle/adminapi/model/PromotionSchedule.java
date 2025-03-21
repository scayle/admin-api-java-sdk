package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionSchedule extends AbstractModel  {
    /**
    * The beginning of the time range when the promotion is active
    */
    @SerializedName("from")
    java.time.Instant from;

    /**
    * The end of the time range when the promotion is active
    */
    @SerializedName("to")
    java.time.Instant to;

}