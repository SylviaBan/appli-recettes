<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sylwia
  Date: 01/09/2023
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Goodbye</title>
    <c:import url="head.jsp"></c:import>
</head>
<body class="container">
<c:import url="header.jsp"></c:import>
<main>
    <section class="py-5">
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

            <h1 class="py-5">See you !</h1>
        </div>
    </section>
</main>
<c:import url="footer.jsp"></c:import>
</body>
</html>
