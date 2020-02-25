package com.mytests.micronaut.configProperties.beans;

import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeanUsingConfPropsTest {

    @Test
    void getMyConfProps() {
        Map<String, Object> map = new HashMap<>();
        map.put("my.confprops.cp1.prop1", "foo");
        map.put("my.confprops.cp2.prop1", "bar");
        ApplicationContext context = ApplicationContext.run(map);
        BeanUsingConfProps bean = context.getBean(BeanUsingConfProps.class);
        System.out.println("**********************************");
        System.out.println(bean.getMyConfProps());
        System.out.println("**********************************");
        assertEquals(bean.getMyConfProps(), "foo bar");
    }
    @Test
    void getMyConfProps2() {

        ApplicationContext context = ApplicationContext.run();
        BeanUsingConfProps bean = context.getBean(BeanUsingConfProps.class);
        System.out.println("**********************************");
        System.out.println(bean.getMyConfProps());
        System.out.println("**********************************");
        assertEquals(bean.getMyConfProps(), "conf1 props conf2 props");
    }
}
