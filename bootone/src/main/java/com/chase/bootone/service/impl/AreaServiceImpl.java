package com.chase.bootone.service.impl;

import com.chase.bootone.dao.AreaDao;
import com.chase.bootone.pojo.Area;
import com.chase.bootone.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean insertArea(Area area) {
        if (null != area.getAreaName() && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectNum = areaDao.insertArea(area);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败" + e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Transactional
    @Override
    public boolean updateArea(Area area) {
        if (null != area.getAreaId() && !"".equals(area.getAreaId())) {
            area.setLastEditTime(new Date());
            try {
                int effectNum = areaDao.updateArea(area);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新区域信息失败" + e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Transactional
    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {
            try {
                int effectNum = areaDao.deleteArea(areaId);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("id不能为空");
        }
    }
}
