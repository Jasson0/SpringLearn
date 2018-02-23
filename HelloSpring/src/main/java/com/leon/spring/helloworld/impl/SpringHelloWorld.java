package com.leon.spring.helloworld.impl;

import com.leon.spring.helloworld.HelloWorld;

/**
 * Created by leon on 2018/2/6.
 */
public class SpringHelloWorld implements HelloWorld{

    public void sayHello() {
        System.out.println("Spring Say Hello!!");
    }
    public void init(){
        System.out.println("SpringHelloWorld is going through init.");
    }
    public void destroy(){
        System.out.println("SpringHelloWorld will destroy now.");
    }
}
