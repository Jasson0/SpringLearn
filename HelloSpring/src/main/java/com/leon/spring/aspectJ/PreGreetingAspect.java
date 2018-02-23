package com.leon.spring.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by leon on 2018/2/9.
 */
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {// 增强的横切逻辑
        System.out.println("How are you ?");
    }

    @DeclareParents(value = "com.leon.spring.aspectJ.NaiveWaiter", defaultImpl = NaiveServer.class)
    public Server server;

    @Before("execution(* response(..))")
    public void beforeResponse() {// 增强的横切逻辑
        System.out.println("Fine,thank you.");
    }
}
