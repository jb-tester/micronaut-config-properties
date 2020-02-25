package com.mytests.micronaut.configProperties.beans;

import com.mytests.micronaut.configProperties.eachProperty.beans.BeanUsingEachPropertyProps;
import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeanUsingEachPropertyPropsTest {

    @Test
    void getEPConfigProps() {
        Map<String, Object> map = new HashMap<>();
        map.put("my.eachprop.ep1.first.prop2", "foo");
        map.put("my.eachprop.ep1.second.prop2", "bar");
        ApplicationContext context = ApplicationContext.run(map);

        BeanUsingEachPropertyProps bean = context.getBean(BeanUsingEachPropertyProps.class);
        System.out.println("**********************************");
        System.out.println(bean.getEPConfigProps_First());
        System.out.println("**********************************");
        assertEquals(bean.getEPConfigProps_First(), "first foo");
        System.out.println("**********************************");
        System.out.println(bean.getEPConfigProps_Second());
        System.out.println("**********************************");
        assertEquals(bean.getEPConfigProps_Second(), "second bar");
    }

    @Test
    void getEPConfigProps2() {

        ApplicationContext context = ApplicationContext.run();

        BeanUsingEachPropertyProps bean = context.getBean(BeanUsingEachPropertyProps.class);
        System.out.println("**********************************");
        System.out.println(bean.getEPConfigProps_First());
        System.out.println("**********************************");
        assertEquals(bean.getEPConfigProps_First(), "first eachproperty: first prop2");
        System.out.println("**********************************");
        System.out.println(bean.getEPConfigProps_Second());
        System.out.println("**********************************");
        assertEquals(bean.getEPConfigProps_Second(), "second eachproperty: second prop2");
    }
}
