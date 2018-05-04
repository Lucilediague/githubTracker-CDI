<%--
  Created by IntelliJ IDEA.
  User: lucile
  Date: 01/05/18
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/track" enctype="application/x-www-form-urlencoded" method="post">
    <label>login:</label>
    <input name="login" type="text">
    <br/>
    <button type="submit">ok</button>
</form>
</body>
</html>
