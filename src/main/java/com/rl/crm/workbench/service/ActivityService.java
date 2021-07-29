package com.rl.crm.workbench.service;

import com.rl.crm.vo.PageinationVo;
import com.rl.crm.workbench.domain.Activity;

import java.util.Map;

public interface ActivityService {
    boolean save(Activity activity);

    PageinationVo<Activity> pageList(Map<String, Object> map);


    boolean delete(String[] ids);

    Map<String, Object> getUserListAndActivity(String id);
}
