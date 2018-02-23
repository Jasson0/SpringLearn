package com.leon.spring.aspectJ;

/**
 * Created by leon on 2018/2/9.
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("NaiveWaiter Greet To " + name);
    }

    public void serverTo(String name) {
        System.out.println("NaiveWaiter Server To " + name);
    }
}
