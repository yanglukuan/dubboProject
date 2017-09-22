package com.yanglk.test.dubbo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;


// 默认只会Component Scan com.ctrip.financialservice.forex.online以及其子package，
// 如果需要Scan更多的package可以使用
// @SpringBootApplication(scanBasePackages = {"com.ctrip.financialservice.forex.online", "other package"})
//所有bean都位于com.ctrip.financialservice.forex.online  包下 所以都会被扫描注入 不需要再配置ComponentScan

@SpringBootApplication//Spring Boot会自动扫描@SpringBootApplication所在类的同级包,以及下级包里的所有BEAN，所以建议入口类放在最外层的包名下。
//EnableAutoConfiguration  开启了自动配置  @EnableAspectJAutoProxy @WebMvcAutoConfiguration  exclude可以排除掉自动配置项
public class WebInitializer extends SpringBootServletInitializer {

  /**
   * Configure your application when it’s launched by the servlet container
   */
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(WebInitializer.class);

  }



  //入口方法
  public static  void main(String[] args) throws Exception {
    SpringApplication.run(WebInitializer.class,args);
    System.setProperty("java.awt.headless", "false");
    Desktop.getDesktop().browse(new URI("http://localhost:8080"));
  }

}
