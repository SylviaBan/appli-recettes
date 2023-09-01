<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sylwia
  Date: 01/09/2023
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Home</title>
  <c:import url="head.jsp"></c:import>
</head>
<body class="container">
<c:import url="header.jsp"></c:import>
<main class="my-custom-bg">
  <div class="bg-image p-5 text-center shadow-1-strong rounded mb-5 text-white"
       style="background-image: url('https://mdbootstrap.com/img/Photos/Others/images/73.jpg');
          background-size: 1000px;
          background-repeat: no-repeat;
          background-position: center;
          position: relative;
          overflow: hidden;
          background-attachment: fixed;
         width: 100%;
         height: 100%;">

    <h1 class="mt-5 mb-4 h1">Welcome to our Food App!</h1>
    <h6 class="text-center">
      Savor the flavors and explore culinary delights with us.
    </h6>
    <h5 class="fixed-bottom text-center py-5">
      Let's make your dining experience unforgettable! 🍽️🥂
    </h5>
  </div>
</main>
<c:import url="footer.jsp"></c:import>
</body>
</html>
