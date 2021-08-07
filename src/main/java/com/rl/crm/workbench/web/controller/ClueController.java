package com.rl.crm.workbench.web.controller;

import com.rl.crm.settings.domain.User;
import com.rl.crm.settings.service.UserService;
import com.rl.crm.settings.service.impl.UserServiceImpl;
import com.rl.crm.utils.DateTimeUtil;
import com.rl.crm.utils.PrintJson;
import com.rl.crm.utils.ServiceFactory;
import com.rl.crm.utils.UUIDUtil;
import com.rl.crm.vo.PageinationVo;
import com.rl.crm.workbench.domain.Activity;
import com.rl.crm.workbench.domain.ActivityRemark;
import com.rl.crm.workbench.service.ActivityService;
import com.rl.crm.workbench.service.impl.ActivityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClueController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("进入线索控制器");
        String path = request.getServletPath();

        if ("/workbench/activity/getUserList.do".equals(path)) {
            //getUserList(request,response);
        } else if ("/workbench/activity/save.do".equals(path)) {
            //save(request,response);
        }
    }

}
