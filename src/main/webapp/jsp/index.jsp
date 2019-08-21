<%--
  Created by IntelliJ IDEA.
  User: hongqizhixing
  Date: 2019/8/14
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/welcome">
        姓名:<input type="text" name="name"> <br>
        年龄:<input type="text" name="age"> <br>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
