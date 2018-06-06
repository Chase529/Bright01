package com.chase.bootone.dao;

import com.chase.bootone.pojo.Area;


import java.util.List;


public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);

}
