package com.rl.crm.workbench.service.impl;

import com.rl.crm.settings.dao.UserDao;
import com.rl.crm.settings.domain.User;
import com.rl.crm.utils.SqlSessionUtil;
import com.rl.crm.vo.PageinationVo;
import com.rl.crm.workbench.dao.ActivityDao;
import com.rl.crm.workbench.dao.ActivityRemarkDao;
import com.rl.crm.workbench.domain.Activity;
import com.rl.crm.workbench.service.ActivityService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ActivityServiceImpl implements ActivityService {
    private ActivityDao activityDao = SqlSessionUtil.getSqlSession().getMapper(ActivityDao.class);
    private ActivityRemarkDao activityRemarkDao = SqlSessionUtil.getSqlSession().getMapper(ActivityRemarkDao.class);
    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

    public boolean save(Activity activity) {
        boolean flag = true;
        int count = activityDao.save(activity);
        if (count!=1){
            flag=false;
        }
        return flag;
    }

    public PageinationVo<Activity> pageList(Map<String, Object> map) {
        //取得total
        int total = activityDao.getTotalByCondition(map);

        //取得dataList
        List<Activity>dataList = activityDao.getActivityListByCondition(map);

        //将total和dataList封装到vo中
        PageinationVo<Activity>vo = new PageinationVo<Activity>();
        vo.setTotal(total);
        vo.setDataList(dataList);

        //将vo返回
        return vo;
    }

    public boolean delete(String[] ids) {
        boolean flag=true;
        //查询出需要删除的备注数量
        int count1 = activityRemarkDao.getCountByAids(ids);
        System.out.println(count1);

        //删除备注，返回影响数量
        int count2 = activityRemarkDao.deleteByAids(ids);
        System.out.println(count2);
        if (count1!=count2){
            flag=false;
        }

        //删除市场活动
        int count3=activityDao.delete(ids);
        System.out.println(count3);
        if (count3!=ids.length){
            flag=false;
        }
        System.out.println(flag);
        return flag;
    }

    public Map<String, Object> getUserListAndActivity(String id) {
        //取uList
        List<User> uList = userDao.getUserList();
        //取a
        Activity a = activityDao.getById(id);

        //返回map
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("uList",uList);
        map.put("a",a);
        return map;
    }
}
