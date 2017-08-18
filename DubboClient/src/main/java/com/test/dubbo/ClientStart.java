package com.test.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by yanglk on 2017/6/7.
 */
@Component
public class ClientStart {

    @Reference
    static TestService service;

    public static void main(String[] args) {
        System.out.println("hello dubbo");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        for (int i = 0; i < 10; i++) {

            String response = service.sayHello("dubbo ");
            String serverIP = RpcContext.getContext().getRemoteHost();
            System.out.println(response + serverIP);
        }

    }
}
