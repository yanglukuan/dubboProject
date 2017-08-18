package com.test.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by yanglk on 2017/6/7.
 */
public interface TestService {
    String sayHello(String name);
}
