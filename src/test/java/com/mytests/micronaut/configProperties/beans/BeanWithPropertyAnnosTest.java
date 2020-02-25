package com.mytests.micronaut.configProperties.beans;

import com.mytests.micronaut.configProperties.propertyAnnotation.BeanWithPropertyAnnos;
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
    @Test
    void testInjectingValueUsingValueAnnotation() {
        ApplicationContext context = ApplicationContext.run();
        BeanWithPropertyAnnos bean = context.getBean(BeanWithPropertyAnnos.class);
        //
        assertEquals(bean.getP2(),"p2_value");


    }

}
