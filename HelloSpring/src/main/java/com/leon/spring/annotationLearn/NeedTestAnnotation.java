package com.leon.spring.annotationLearn;

import java.lang.annotation.*;

/**
 * Created by leon on 2018/2/9.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface NeedTestAnnotation {
    boolean value() default false;
}
