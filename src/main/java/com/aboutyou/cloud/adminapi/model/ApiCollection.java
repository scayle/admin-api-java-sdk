package com.aboutyou.cloud.adminapi.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class ApiCollection<T> implements ApiObjectInterface{
    @SerializedName("entities")
    List<T> entities;
}