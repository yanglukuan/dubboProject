package com.test.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.dubbo.model.CityEntity;
import com.test.dubbo.service.TestService;

/**
 * Created by yanglk on 2017/6/7.
 */
@Service
public class TestServiceImpl implements TestService {


    public String sayHello(String name) {
        return "Hi"+name;
    }


    public CityEntity getCity() {
        CityEntity city=new CityEntity();

        city.setName("test");
        city.setAount(10);

        return city;
    }
}
