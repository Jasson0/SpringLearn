package com.leon.spring;

import com.leon.spring.helloworld.HelloWorld;
import com.leon.spring.helloworld.HelloWorldService;
import com.leon.spring.helloworld.impl.InitHelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/6.
 */
public class HelloProgram {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HelloWorldService service =
                (HelloWorldService) context.getBean("helloWorldService");

        HelloWorld hw= service.getHelloWorld();

        hw.sayHello();
    }
}
