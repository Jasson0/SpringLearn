package com.leon.spring.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/9.
 */
public class PreGreetingAspectTest {
    public static void main(String[] args) {
        //1
//        // 目标类
//        Waiter target = new NaiveWaiter();
//        // 实例化切面代理工厂
//        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
//        // 设置目标对象
//        aspectJProxyFactory.setTarget(target);
//        // 添加切面类
//        aspectJProxyFactory.addAspect(PreGreetingAspect.class);
//        // 生成织入切面的代理对象
//        Waiter proxy = aspectJProxyFactory.getProxy();
//        // 调用业务方法
//        proxy.greetTo("XiaoGongJiang");
//        proxy.serverTo("XiaoGongJiang");
//        2.
//        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectJConfig/conf-aspectJ.xml");
//        Waiter waiter = ac.getBean("waiter", Waiter.class);
//        waiter.greetTo("XiaoGongJiang");
//        waiter.serverTo("XiaoGongJiang");
        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectJConfig/aop-config.xml");
        Waiter waiter = ac.getBean("waiter", Waiter.class);
        Server server = (Server) waiter;
        waiter.greetTo("XiaoGongJiang");
        server.response("NaiveWaiter");
    }
}
