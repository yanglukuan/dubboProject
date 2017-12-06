package com.test.dubbo.service;

import com.test.dubbo.model.CityEntity;

/**
 * Created by yanglk on 2017/6/7.
 */
public interface TestService {
    String sayHello(String name);
    CityEntity getCity();
}
