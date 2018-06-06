package com.chase.bootone.dao;

import com.chase.bootone.pojo.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Ignore
    @Test
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }
    @Ignore
    @Test
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(1);
        assertEquals("雁塔",area.getAreaName());
    }
    @Ignore
    @Test
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("碑林");
        area.setPriority(1);
        int effectNum = areaDao.insertArea(area);
        assertEquals(1,effectNum);
    }

    @Ignore
    @Test
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaName("西城");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectNum = areaDao.updateArea(area);
        assertEquals(1,effectNum);
    }

    @Test
    public void deleteArea() throws Exception {
        int effectNum = areaDao.deleteArea(3);
        assertEquals(1,effectNum);
    }

}