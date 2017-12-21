package com.yanglk.test.dubbo.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.model.CityEntity;
import com.test.dubbo.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yanglk on 2017/6/13.
 */
@Service
public class DubboServiceImpl implements DubboService {

    @Reference
    static TestService service;

    public String sayHello(String name) {
         return  service.sayHello(name);
    }

    public   int getCityCount(){
        return service.getCityCount();
    }

    public List<CityEntity> getCityList(){
        return service.getCityList();
    }

    public CityEntity  getCityInfo(int id){
        return service.getCityInfo(id);
    }
}
