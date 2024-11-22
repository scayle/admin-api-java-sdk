package com.scayle.adminapi.model;

import com.scayle.adminapi.serializer.JsonSerializer;

public abstract class AbstractModel extends AbstractApiObject {
    private transient JsonSerializer jsonSerializer;

    public AbstractModel() {
        this.jsonSerializer = new JsonSerializer();
    }

    public String toString(){
        return this.jsonSerializer.serializeApiObject(this);
    }
}