package com.mytests.micronaut.configProperties.beans;

import com.mytests.micronaut.configProperties.eachPropertyBeans.MyEPConfig1;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class BeanUsingEachPropertyProps {

    @Inject
    @Named("first")
    MyEPConfig1 epConfig1;

    public String getEPConfigProps() {
        String rez = epConfig1.getProp2();
        return "first " + rez;
    }
}
