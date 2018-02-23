package com.leon.spring.helloworld.impl;

import com.leon.spring.helloworld.HelloWorld;

/**
 * Created by leon on 2018/2/6.
 */
public class StrutsHelloWorld implements HelloWorld {
    public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }

    public void init(){
        System.out.println("StrutsHelloWorld is going through init.");
    }
    public void destroy(){
        System.out.println("StrutsHelloWorld will destroy now.");
    }
}
