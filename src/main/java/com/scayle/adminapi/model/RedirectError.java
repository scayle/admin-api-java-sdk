package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedirectError implements ApiObjectInterface {
    /**
    * A key that describes the occurred error.
    */
    @SerializedName("errorKey")
    String errorKey;

    /**
    * Some human readable description of the error.
    */
    @SerializedName("message")
    String message;

}