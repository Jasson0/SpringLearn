package com.leon.spring.aspectJ.function.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by leon on 2018/2/11.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface NeedTest {
    boolean value() default false;
}
