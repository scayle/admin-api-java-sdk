package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cursor implements ApiObjectInterface {
    /**
    * The cursor pointing to the next page. If null there is no next page available.
    */
    @SerializedName("next")
    String next;

}