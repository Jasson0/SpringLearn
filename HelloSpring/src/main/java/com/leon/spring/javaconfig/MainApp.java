package com.leon.spring.javaconfig;

import com.leon.spring.dilearn.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by leon on 2018/2/9.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        TextEditor hw = ac.getBean(TextEditor.class);
        hw.spellCheck();
    }
}
