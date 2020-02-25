package com.mytests.micronaut.configProperties.configurationProperties.beans;

import com.mytests.micronaut.configProperties.configurationProperties.confprops.MyConfProps1;
import com.mytests.micronaut.configProperties.configurationProperties.confprops.MyConfProps2;

import javax.inject.Singleton;

@Singleton
public class BeanUsingConfProps {


    MyConfProps1 myConfProps1;

    MyConfProps2 myConfProps2;

    public BeanUsingConfProps(MyConfProps1 myConfProps1, MyConfProps2 myConfProps2) {
        this.myConfProps1 = myConfProps1;
        this.myConfProps2 = myConfProps2;
    }

    public String getMyConfProps() {

        String prop11 = myConfProps1.getProp1();
        String prop21 = myConfProps2.getProp1();
        return prop11 + " " + prop21;
    }
}
