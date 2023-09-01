<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="./assets/css/generalStyle.css" />
</head>
<body>

<h1>login</h1>


<c:if test="${not empty error}">
    <div>${error}</div>
</c:if>
<form action="login" method="post">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <input type="submit" value="Sign in">
</form>


</body>
</html>
