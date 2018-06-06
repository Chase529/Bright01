package com.chase.bootone.web;

import com.chase.bootone.pojo.City;
import com.chase.bootone.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mycity")
public class CityControler {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/listcity", method = RequestMethod.GET)
    private Map<String, Object> listCity() {
        Map<String, Object> modelMap = new HashMap<>();
        List<City> list = cityService.getCityList();
        modelMap.put("cityList", list);
        return modelMap;
    }

}
