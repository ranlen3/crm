package com.rl.crm.settings.service.impl;

import com.rl.crm.settings.dao.DicTypeDao;
import com.rl.crm.settings.dao.DicValueDao;
import com.rl.crm.settings.service.DicService;
import com.rl.crm.utils.SqlSessionUtil;

public class DicServiceImpl implements DicService {
    private DicTypeDao dicTypeDao = SqlSessionUtil.getSqlSession().getMapper(DicTypeDao.class);
    private DicValueDao dicValueDao = SqlSessionUtil.getSqlSession().getMapper(DicValueDao.class);

}
