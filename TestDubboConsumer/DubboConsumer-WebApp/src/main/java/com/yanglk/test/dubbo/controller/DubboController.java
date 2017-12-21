package com.yanglk.test.dubbo.controller;

import com.test.dubbo.model.CityEntity;
import com.yanglk.test.dubbo.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by yanglk on 2017/6/12.
 */
@Controller
@Scope("request")
@RequestMapping()
public class DubboController {


    @Autowired
    private DubboService dubboService;

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView index =new ModelAndView();
        index.setViewName("index");

        String ss=dubboService.sayHello("dubbo");
        index.addObject("hi",ss);


        int cityCount=dubboService.getCityCount();
        index.addObject("cityCount",cityCount);

        List<CityEntity> cityList=dubboService.getCityList();
        index.addObject("cityList",cityList);

        return index;
    }

}
