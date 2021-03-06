package com.mytests.micronaut.configProperties.propertyAnnotation;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/30/2020.
 * Project: micronaut-config-properties
 * *******************************
 */
@Singleton
public class BeanWithPropertyAnnos {

    @Property(name = "my.props.p1")
    String p1;

    @Value("${my.props.p2}")
    String p2;

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

}
