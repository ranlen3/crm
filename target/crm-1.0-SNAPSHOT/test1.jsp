<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
        $.ajax({
            url : "",
            data : {

            },
            type : "",
            dataType : "json",
            success : function (data) {

            }
        })

        //创建时间当前系统时间
        String createTime=DateTimeUtil.getSysTime();
        //创建人，当前用户
        String createBy =((User)request.getSession().getAttribute("user")).getName();
</body>
</html>
