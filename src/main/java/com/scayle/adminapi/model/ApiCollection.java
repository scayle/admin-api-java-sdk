package com.scayle.adminapi.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.scayle.adminapi.model.Cursor;

import lombok.Getter;

@Getter
public class ApiCollection<T> extends AbstractApiObject implements ApiObjectInterface{
    @SerializedName("entities")
    List<T> entities;

    @SerializedName("cursor")
    Cursor cursor;
}