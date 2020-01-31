package com.mytests.micronaut.configProperties.beans;

import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/31/2020.
 * Project: micronaut-config-properties
 * *******************************
 */
class BeanWithPropertyAnnosTest {
    @Test
    void testInjectingValueUsingPropertyAnnotation() {
        ApplicationContext context = ApplicationContext.run();
        BeanWithPropertyAnnos bean = context.getBean(BeanWithPropertyAnnos.class);
        //
        assertEquals(bean.getP1(),"p1_value");


    }
}
