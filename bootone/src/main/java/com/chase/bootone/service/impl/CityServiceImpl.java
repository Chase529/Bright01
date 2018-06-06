package com.chase.bootone.service.impl;

import com.chase.bootone.dao.CityDao;
import com.chase.bootone.pojo.City;
import com.chase.bootone.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> getCityList() {
        return cityDao.queryCity();
    }
}
