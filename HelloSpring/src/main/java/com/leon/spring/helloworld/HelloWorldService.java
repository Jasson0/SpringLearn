package com.leon.spring.helloworld;

/**
 * Created by leon on 2018/2/6.
 */
public class HelloWorldService {
    private HelloWorld helloWorld;

    public HelloWorldService() {

    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }
}
