package com.leon.spring.aspectJ.function.annotation;

/**
 * Created by leon on 2018/2/11.
 */
public class NaiveWaiter implements Waiter {
    @NeedTest
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter:greet to " + clientName);

    }

    public void serverTo(String clientName) {
        System.out.println("NaiveWaiter:server to " + clientName);

    }

    public void smile(String clientName, int times) {
        System.out.println("NaiveWaiter:smile to  " + clientName + " " + times
                + " times");
    }
}
