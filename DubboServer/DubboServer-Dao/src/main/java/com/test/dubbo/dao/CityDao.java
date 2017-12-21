package com.test.dubbo.dao;

import com.test.dubbo.model.CityEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lukuanpc on 2016/12/25.
 */
@Repository
public interface CityDao {
     int selectCount();
     List<CityEntity> getCityList();
     CityEntity getCityInfo(int id);

}
