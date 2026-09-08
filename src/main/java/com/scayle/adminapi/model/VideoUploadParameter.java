package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VideoUploadParameter extends AbstractModel  {
    /**
    * Name of the upload parameter.
    */
    @SerializedName("name")
    String name;

    /**
    * Value of the upload parameter (string or number).
    */
    @SerializedName("value")
    Object value;

}