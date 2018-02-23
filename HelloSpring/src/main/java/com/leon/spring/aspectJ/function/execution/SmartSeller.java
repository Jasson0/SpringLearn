package com.leon.spring.aspectJ.function.execution;

/**
 * Created by leon on 2018/2/11.
 */
public class SmartSeller {
    /**
     * public方法，演示execution(public * *(..)),能匹配到
     */
    public void sell(String goods) {
        System.out.println("SmartSeller sells " + goods);
    }

    /**
     * @param clientName
     * @Title: smileTo
     * @Description: 非public方法，演示execution(public * *(..))，不能匹配到
     * @return: void
     */
    protected void smileTo(String clientName) {
        System.out.println("SmartSeller simles to " + clientName);
    }
}
