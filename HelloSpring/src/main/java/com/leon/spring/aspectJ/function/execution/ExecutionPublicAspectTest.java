package com.leon.spring.aspectJ.function.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/11.
 */
public class ExecutionPublicAspectTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectJConfig/conf-execution.xml");
        SmartSeller smartSeller = (SmartSeller) ac.getBean("smartSeller");
        // sell方法是public,会织入前置增强中的横切逻辑
        smartSeller.sell("bread");
        // smileTo方法是protec,不会织入前置增强中的横切逻辑
        smartSeller.smileTo("XiaoGongJiang");
        NaiveWaiter naiveWaiter = (NaiveWaiter) ac.getBean("naiveWaiter");
        // greetTo方法是public,会织入前置增强中的横切逻辑
        naiveWaiter.greetTo("XiaoGongJiang");
    }
}
