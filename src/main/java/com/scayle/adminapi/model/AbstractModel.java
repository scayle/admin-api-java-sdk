package com.scayle.adminapi.model;

import com.scayle.adminapi.serializer.JsonSerializer;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public abstract class AbstractModel extends AbstractApiObject {
    private transient JsonSerializer jsonSerializer;

    protected transient String[] nullFields;

    public AbstractModel() {
        this.jsonSerializer = new JsonSerializer();
    }

    public String toString(){
        return this.jsonSerializer.serializeApiObject(this);
    }

    // This method records what field was set to null
    public void setNull(String fieldName) {
        if (this.nullFields == null) {
            this.nullFields = new String[]{fieldName};
        } else {
            String[] newNullFields = new String[this.nullFields.length + 1];
            System.arraycopy(this.nullFields, 0, newNullFields, 0, this.nullFields.length);
            newNullFields[this.nullFields.length] = fieldName;
            this.nullFields = newNullFields;
        }
    }

    public Set<String> getExplicitlyNullFields() {
        if (this.nullFields == null || this.nullFields.length == 0) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(this.nullFields)));
    }
}