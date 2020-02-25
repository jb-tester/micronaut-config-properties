package com.mytests.micronaut.configProperties.configurationProperties.confprops;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("my.confprops.cp2")
public class MyConfProps2 {

    String prop1;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(final String prop1) {
        this.prop1 = prop1;
    }
}
