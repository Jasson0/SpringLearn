package com.leon.spring.aspectJ.function.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/11.
 */
public class AnnotationTestAspcetTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectJConfig/conf-annotation.xml");

//        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectJConfig/con-annotation.xml");
        // 必须是接口类型,否则抛类型转换异常
        Waiter waiter = (Waiter) ac.getBean("naiveWaiter");

        // 因为greetTo标注了@NeedTest,因此会被后置增强
        waiter.greetTo("XiaoGongJiang");
        waiter.serverTo("XiaoGongJiang");

        Waiter naughtWaiter = (Waiter) ac.getBean("naughtWaiter");
        // serverTo标注了@NeedTest,因此会被后置增强
        naughtWaiter.serverTo("XiaoGongJiang");
    }
}
