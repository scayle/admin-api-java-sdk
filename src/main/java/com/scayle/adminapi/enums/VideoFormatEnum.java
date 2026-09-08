package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VideoFormatEnum {
    @SerializedName("mp4")
    VALUE_MP4("mp4"),

    @SerializedName("mkv")
    VALUE_MKV("mkv"),

    @SerializedName("avi")
    VALUE_AVI("avi"),

    @SerializedName("mov")
    VALUE_MOV("mov"),

    @SerializedName("webm")
    VALUE_WEBM("webm"),

    @SerializedName("wmv")
    VALUE_WMV("wmv"),

    @SerializedName("flv")
    VALUE_FLV("flv"),

    @SerializedName("3gp")
    VALUE_3GP("3gp"),

    @SerializedName("mpg")
    VALUE_MPG("mpg"),

    @SerializedName("mpeg")
    VALUE_MPEG("mpeg");


    private final String val;

    VideoFormatEnum(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}