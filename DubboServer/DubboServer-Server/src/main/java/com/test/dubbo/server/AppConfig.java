package com.test.dubbo.server;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Created by yanglk on 2017/6/9.
 */
@Configuration
@MapperScan(basePackages = "com.test.dubbo.dao")
public class AppConfig {
    /**
     * 注入dubbo上下文
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("CityService");
        return applicationConfig;
    }

    /**
     * 与<dubbo:annotation/>相当.
     * 提供方扫描带有@com.alibaba.dubbo.config.annotation.
     * Service的注解类
     *
     * @return
     */
    @Bean
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage("com.test.dubbo");
        return annotationBean;
    }

    /**
     * 使用zookeeper注册中心暴露服务地址
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 用dubbo协议在指定端口暴露服务
     *
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo", 20880);
        // 默认为hessian2,但不支持无参构造函数类,而这种方式的效率很低
        //protocolConfig.setSerialization("java");
        return protocolConfig;
    }


    //mybatis
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.1.103:3306/world");
        dataSource.setUsername("admin");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() throws NamingException {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource());
//        factory.setConfigLocation(new ClassPathResource("mybatis/mybatis-config.xml"));
        factory.setTypeAliasesPackage("com.test.dubbo.model");
        return factory;
    }


}
