package com.mytests.micronaut.configProperties.eachProperty.beans;

public class BeanUsingEachPropertyPropsAsEachBean {

    String prop1;
    String prop2;

    public BeanUsingEachPropertyPropsAsEachBean(String prop1, String prop2) {
        this.prop2 = prop2;
        this.prop1 = prop1;
    }

    public String getProps() {
        return prop1 + " " + prop2;
    }
}
