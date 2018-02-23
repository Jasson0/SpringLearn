package com.leon.spring.aspectJ.function.annotation;

/**
 * Created by leon on 2018/2/11.
 */
public class NaughtWaiter implements Waiter {
    public void greetTo(String clientName) {
        System.out.println("NaughtWaiter:greet to " + clientName);

    }

    @NeedTest(value = true)
    public void serverTo(String clientName) {
        System.out.println("NaughtWaiter:server to " + clientName);

    }

    public void joke(String clientName, int times) {
        System.out.println("NaughtyWaiter:play " + times + " jokes to "
                + clientName);
    }
}
