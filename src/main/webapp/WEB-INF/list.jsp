<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="javax.persistence.EntityManagerFactory" %>
<%@ page import="javax.persistence.Persistence" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: sylwia
  Date: 01/09/2023
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of recipes</title>
    <c:import url="head.jsp"></c:import>
</head>
<body class="container my-custom-bg">
<c:import url="header.jsp"></c:import>
<main>
    <section class="py-5">
        <div class="container py-5">
            <h1 class="text-light d-flex justify-content-center">Recipes</h1>
            <table class="table">
                <thead>
                <tr class="text-light">
                    <th>#</th>
                    <th>Name</th>
                    <th>Category</th>
                    <th>Recipe ingredients</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${recipes}" var="game">
                    <tr class="text-light">
                        <th>${recipes.getId()}</th>
                        <td class="text-light">${recipes.getName()}</td>
                        <td>${recipes.getCategory()}</td>
                        <td>${recipes.getRecipe_method()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </section>
</main>
<c:import url="footer.jsp"></c:import>
</body>
</html>
