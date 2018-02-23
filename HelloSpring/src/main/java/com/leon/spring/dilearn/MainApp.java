package com.leon.spring.dilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by leon on 2018/2/7.
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans2.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext("SpringConfig");
        TextEditor te = ac.getBean(TextEditor.class);
        SpellChecker sc = ac.getBean(SpellChecker.class);
        te.spellCheck();
    }
}
