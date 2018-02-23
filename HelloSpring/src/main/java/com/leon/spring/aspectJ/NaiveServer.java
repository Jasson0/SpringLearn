package com.leon.spring.aspectJ;

/**
 * Created by leon on 2018/2/9.
 */
public class NaiveServer implements Server {
    public void response(String name) {
        System.out.println("NaiveServer response To " + name);
    }
}
