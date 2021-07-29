package com.rl.crm.settings.web.controller;

import com.rl.crm.settings.domain.User;
import com.rl.crm.settings.service.UserService;
import com.rl.crm.settings.service.impl.UserServiceImpl;
import com.rl.crm.utils.MD5Util;
import com.rl.crm.utils.PrintJson;
import com.rl.crm.utils.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("进入控制器");
        String path = request.getServletPath();

        if ("/settings/user/login.do".equals(path)) {
            //xxx()
            login(request,response);
        } else if ("/settings/user/xxx.do".equals(path)) {
            //xxx()
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("进入验证");
        String loginAct = request.getParameter("loginAct");
        String loginPwd = request.getParameter("loginPwd");

        //明文装密文
        loginPwd = MD5Util.getMD5(loginPwd);
        //接收浏览器的ip地址
        String ip = request.getRemoteAddr();
        System.out.println("ip=========="+ip);

        //事务层开发,统一用代理类形态的接口对象
        UserService us = (UserService) ServiceFactory.getService(new UserServiceImpl());
        try {
            User user = us.login(loginAct,loginPwd,ip);
            request.getSession().setAttribute("user",user);
            //执行到此，表示登录成功
            PrintJson.printJsonFlag(response,true);
        }catch (Exception e){
            e.printStackTrace();
            //执行到此,登录失败
            String msg = e.getMessage();
            /*
            为Ajax题库多项信息

            信息需求次数多创建vo类，少则使用map
             */
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("success",false);
            map.put("msg",msg);
            PrintJson.printJsonObj(response,map);
        }
    }
}
