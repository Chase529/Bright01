package com.chase.bootone.service;

import com.chase.bootone.pojo.Area;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.List;

public interface AreaService {

    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean insertArea(Area area);

    boolean updateArea(Area area);

    boolean deleteArea(int areaId);

}
