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
</body>
</html>
