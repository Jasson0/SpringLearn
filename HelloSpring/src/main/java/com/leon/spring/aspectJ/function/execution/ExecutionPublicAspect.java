package com.leon.spring.aspectJ.function.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by leon on 2018/2/11.
 */
@Aspect
public class ExecutionPublicAspect {
    //切入点为NaiveWaiter下面的所有public方法
    @Before("execution(public * com.leon.spring.aspectJ.function.execution.NaiveWaiter..*(..))")
    public void crossCuttingLogic() {
        System.out.println("在对应的NaiveWaiter中，织入前置增强,横切逻辑code");
    }

    @Before("execution(* com..*Seller.smile*(..))")
    public void crossCuttingLogic2() {
        System.out.println("匹配包名前缀为com的任何包下类名后缀为Seller的方法，方法名必须以smile为前缀");
    }

}
