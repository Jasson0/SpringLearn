package com.leon.spring.annotationLearn;

import java.lang.reflect.Method;

/**
 * Created by leon on 2018/2/9.
 */
public class AnnotaitionSelfDefineTool {
    public static void main(String[] args) {
        // 得到对应的Class
        Class<ForumService> clazz = ForumService.class;

        // 因为标注在方法上,所以先得到对应的方法
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(clazz.getName() + " 有 " + methods.length + " 个方法");
        // 遍历方法
        for (Method method : methods) {
            // 获取方法上的注解
            NeedTestAnnotation needTestAnnotation = method
                    .getAnnotation(NeedTestAnnotation.class);
            // 判断是否有标注此注解
            if (needTestAnnotation != null) {
                // 获取注解中定义的值，做处理
                if (needTestAnnotation.value()) {
                    System.out.println(method.getName() + "需要测试");
                } else {
                    System.out.println(method.getName() + "不需要测试");
                }
            }
        }
    }
}
