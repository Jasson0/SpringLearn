package com.leon.spring.aspectJ.function.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by leon on 2018/2/11.
 */
@Aspect
public class AnnotationTestAspect {
    @AfterReturning("@annotation(com.leon.spring.aspectJ.function.annotation.NeedTest)")
    public void needTest() {
        System.out.println("needTest() executed,some logic is here");
    }
}
