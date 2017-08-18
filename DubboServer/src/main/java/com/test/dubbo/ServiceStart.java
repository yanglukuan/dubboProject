package com.test.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanglk on 2017/6/7.
 */
public class ServiceStart {
    public static void main(String[] args) {
        // 加载applicationContext.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("start dubbo");
        while (true) {
            Thread.yield();
        }
    }
}
