package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CampaignColor extends AbstractModel  {
    /**
    * Background color in hex code with hash
    */
    @SerializedName("background")
    String background;

    public void setBackground(String value) {
        if (value == null) {
            this.setNull("background");
        }
        this.background = value;
    }
    /**
    * Text color in hex code with hash
    */
    @SerializedName("text")
    String text;

    public void setText(String value) {
        if (value == null) {
            this.setNull("text");
        }
        this.text = value;
    }
}