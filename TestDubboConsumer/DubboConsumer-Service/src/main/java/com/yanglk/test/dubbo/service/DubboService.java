package com.yanglk.test.dubbo.service;

import com.test.dubbo.CityEntity;

/**
 * Created by yanglk on 2017/6/13.
 */
public interface DubboService {

    String sayHello(String name);
    CityEntity getCity();

}
