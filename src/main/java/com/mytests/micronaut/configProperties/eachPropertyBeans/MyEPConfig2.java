package com.mytests.micronaut.configProperties.eachPropertyBeans;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("my.eachprop.ep2")
public class MyEPConfig2 {
    String prop1;
    String prop2 = "default prop2";

    public MyEPConfig2(@Parameter String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }
}
