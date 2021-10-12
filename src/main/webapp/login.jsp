<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2021/8/31
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick11" method="post">
    用户名：<input type="text" name="userlist[0].username"><br>
   年龄：<input type="text" name="userlist[0].age"><br>

    用户名：<input type="text" name="userlist[1].username"><br>
年龄：<input type="text" name="userlist[1].age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
