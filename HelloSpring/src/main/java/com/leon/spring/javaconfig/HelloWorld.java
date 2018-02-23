package com.leon.spring.javaconfig;

/**
 * Created by leon on 2018/2/9.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
