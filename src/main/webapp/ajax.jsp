<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2021/8/31
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script>
        var userlist = new Array();
        userlist.push({username: "zhangsan", age: 18});
        userlist.push({username: "lisi", age: 18});

        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/user/quick12",
            data: JSON.stringify(userlist),
            contentType: "application/json;charset=utf-8"

        });
    </script>
</head>
<body>

</body>
</html>
