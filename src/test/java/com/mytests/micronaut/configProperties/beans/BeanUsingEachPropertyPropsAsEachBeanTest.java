package com.mytests.micronaut.configProperties.beans;

import io.micronaut.context.ApplicationContext;
import io.micronaut.inject.qualifiers.Qualifiers;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeanUsingEachPropertyPropsAsEachBeanTest {

    @Test
    void getProps() {
        Map<String, Object> map = new HashMap<>();
        map.put("my.eachprop.ep2.first.prop2", "foo");
        map.put("my.eachprop.ep2.second.prop2", "bar");
        ApplicationContext context = ApplicationContext.run(map);

        BeanUsingEachPropertyPropsAsEachBean first = context.getBean(BeanUsingEachPropertyPropsAsEachBean.class,
                Qualifiers.byName("first"));
        System.out.println("**********************************");
        System.out.println(first.getProps());
        System.out.println("**********************************");
        assertEquals(first.getProps(), "first foo");
    }

    @Test
    void getProps2() {

        ApplicationContext context = ApplicationContext.run();

        BeanUsingEachPropertyPropsAsEachBean second = context.getBean(BeanUsingEachPropertyPropsAsEachBean.class,
                Qualifiers.byName("second"));
        System.out.println("**********************************");
        System.out.println(second.getProps());
        System.out.println("**********************************");
        assertEquals(second.getProps(), "second eachbean : second prop2");
    }
}