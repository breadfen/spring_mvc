<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2021/9/1
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick17" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username"><br>
    <input type="file" name="uploadfile"><br>
    <input type="file" name="uploadfile2"><br>

    <input type="submit"value="提交">
</form>
</body>
</html>
