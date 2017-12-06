package com.test.dubbo;

import java.io.Serializable;

/**
 * Created by lukuanpc on 2017/12/6.
 */
public class CityEntity implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAount() {
        return aount;
    }

    public void setAount(Integer aount) {
        this.aount = aount;
    }

    private Integer aount;
}
