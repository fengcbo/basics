package com.fengcbo.basics.cglib.beans.immutable;

public class ImmutableBeanSample {

    public String name;

    private String value;

    public ImmutableBeanSample(String value) {
        this.value = value;
    }

    public ImmutableBeanSample() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ImmutableBeanSample addValue(String value) {
        this.value = this.value == null ? value : this.value + "," + value;
        return this;
    }
}
