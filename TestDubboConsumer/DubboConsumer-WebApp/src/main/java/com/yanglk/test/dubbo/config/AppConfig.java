//package com.yanglk.test.dubbo.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.spring.AnnotationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by yanglk on 2017/5/23.
// * service扫描 dubbo 配置
// */
//@Configuration
//public class AppConfig {
//
//
//    /**
//     * 注入dubbo上下文
//     *
//     * @return
//     */
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        // 当前应用配置
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("demo-client");
//        return applicationConfig;
//    }
//
//    /**
//     * 与<dubbo:annotation/>相当.
//     * 提供方扫描带有@com.alibaba.dubbo.config.annotation.
//     * Service的注解类
//     *
//     * @return
//     */
//    @Bean
//    public static AnnotationBean annotationBean() {
//        AnnotationBean annotationBean = new AnnotationBean();
//        annotationBean.setPackage("com.yanglk.test.dubbo.service");
//        return annotationBean;
//    }
//
//    /**
//     * 使用zookeeper注册中心暴露服务地址
//     *
//     * @return
//     */
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("zookeeper://10.32.70.4:2181");
//        return registryConfig;
//    }
//
//}
