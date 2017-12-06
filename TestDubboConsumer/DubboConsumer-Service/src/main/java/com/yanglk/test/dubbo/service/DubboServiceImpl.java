package com.yanglk.test.dubbo.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.CityEntity;
import com.test.dubbo.service.TestService;
import org.springframework.stereotype.Service;

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

    public CityEntity getCity(){
        return service.getCity();
    }
}
