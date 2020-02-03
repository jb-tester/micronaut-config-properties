package com.mytests.micronaut.configProperties.beans;

import com.mytests.micronaut.configProperties.eachPropertyBeans.MyEPConfig2;
import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;

@Factory
public class EachPropertyEachBeanUsageFactory {

    @EachBean(MyEPConfig2.class)
    public BeanUsingEachPropertyPropsAsEachBean bean(MyEPConfig2 epConfig2) {
        String prop1 = epConfig2.getProp1();
        String prop2 = epConfig2.getProp2();
        return new BeanUsingEachPropertyPropsAsEachBean(prop1, prop2);
    }
}
