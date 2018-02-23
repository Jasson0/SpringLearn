package com.leon.spring.aspectJ.function.execution;

/**
 * Created by leon on 2018/2/11.
 */
public class NaiveWaiter {
    /**
     * public方法，演示execution(public * *(..)),能匹配到
     */
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter greet to " + clientName);
    }
}
