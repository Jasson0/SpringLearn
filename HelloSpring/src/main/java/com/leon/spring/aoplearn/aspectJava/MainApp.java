package com.leon.spring.aoplearn.aspectJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/11.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("conf-aspectJava.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
//        student.printThrowException();
    }
}
