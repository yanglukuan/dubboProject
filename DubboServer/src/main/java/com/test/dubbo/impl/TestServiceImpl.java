package com.test.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.test.dubbo.TestService;

/**
 * Created by yanglk on 2017/6/7.
 */
@Service
public class TestServiceImpl implements TestService {
    public String sayHello(String name) {
        return "Hi"+name;
    }
}
