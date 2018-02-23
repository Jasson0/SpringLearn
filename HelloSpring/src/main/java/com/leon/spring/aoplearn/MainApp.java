package com.leon.spring.aoplearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leon on 2018/2/9.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans3.xml");
        Student student = (Student) ac.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
