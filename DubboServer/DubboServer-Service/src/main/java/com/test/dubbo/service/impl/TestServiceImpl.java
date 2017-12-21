package com.test.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.dubbo.dao.CityDao;
import com.test.dubbo.model.CityEntity;
import com.test.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yanglk on 2017/6/7.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private CityDao cityDao;

    public String sayHello(String name) {
        return "Hi"+name;
    }


    public int getCityCount() {
        return cityDao.selectCount();
    }

    public List<CityEntity> getCityList(){
        return  cityDao.getCityList();
    }

    public CityEntity  getCityInfo(int id){
        return  cityDao.getCityInfo(id);
    }
}
