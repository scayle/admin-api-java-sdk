package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PurgeUrlPrefixesRequest extends AbstractModel  {
    /**
    * Scheme-less `host + path` prefixes (Cloudflare flex purge-by-prefix format).
Each prefix must not contain a URI scheme, query string, or fragment, and its
host must match a domain configured by the tenant for the targeted environment
(wildcard domains are matched against their base and subdomains).

    */
    @SerializedName("urlPrefixes")
    List<String> urlPrefixes;

}