package com.scayle.adminapi.model;

public abstract class AbstractApiObject implements ApiObjectInterface {
    private transient Meta meta;

    public Meta getMeta() {
        return this.meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}