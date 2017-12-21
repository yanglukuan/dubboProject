package com.test.dubbo.service;

import com.test.dubbo.model.CityEntity;

import java.util.List;

/**
 * Created by yanglk on 2017/6/7.
 */
public interface TestService {
    String sayHello(String name);

    int getCityCount();
    List<CityEntity> getCityList();
    CityEntity  getCityInfo(int id);
}
