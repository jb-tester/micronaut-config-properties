package com.mytests.micronaut.configProperties.eachProperty.beans;

import com.mytests.micronaut.configProperties.eachProperty.eachPropertyConfigurations.MyEPConfig1;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class BeanUsingEachPropertyProps {

    @Inject
    @Named("first")
    MyEPConfig1 epConfig1_first;

    public String getEPConfigProps_First() {
        String rez = epConfig1_first.getProp2();
        return "first " + rez;
    }
    @Inject
    @Named("second")
    MyEPConfig1 epConfig1_second;

    public String getEPConfigProps_Second() {
        String rez = epConfig1_second.getProp2();
        return "second " + rez;
    }
}
