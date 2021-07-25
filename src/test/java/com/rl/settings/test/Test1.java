package com.rl.settings.test;

import com.rl.crm.utils.DateTimeUtil;
import com.rl.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //验证失效时间
//        String expireTime = "2019-10-10 10:10:10";
//
//        String curTime= DateTimeUtil.getSysTime();
//
//        int count=expireTime.compareTo(curTime);
//        System.out.println(count);

//        String lockState = "0";
//        if ("0".equals(lockState)){
//            System.out.println("账号已锁定");
//        }

        //浏览器地址
//        String ip="192.168.1.3";
//        //允许访问的地址
//        String alIps="192.168.1.1,192.168.1.2";
//
//        if (alIps.contains(ip)){
//            System.out.println("允许访问");
//        }else {
//            System.out.println("不允许访问");
//        }
//
        String pwd = "123";
        String ypwd=MD5Util.getMD5(pwd);
        System.out.println(ypwd);

    }
}
