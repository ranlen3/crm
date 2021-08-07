package com.rl.crm.workbench.service.impl;

import com.rl.crm.utils.SqlSessionUtil;
import com.rl.crm.workbench.dao.ClueDao;
import com.rl.crm.workbench.service.ClueService;

public class ClueServiceImpl implements ClueService {
    private ClueDao clueDao = SqlSessionUtil.getSqlSession().getMapper(ClueDao.class);

}
