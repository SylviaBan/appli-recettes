<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sylwia
  Date: 01/09/2023
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a recipe</title>
    <c:import url="head.jsp"></c:import>
</head>

<body class="container my-custom-bg">
<c:import url="header.jsp"></c:import>
<main>
    <section class="py-5">
        <div class="container py-5">
            <div class="d-flex justify-content-center">
                <h1 class="text-light">Add a recipe</h1>
            </div>
            <div class="col-12 offset-md-1 col-md-6 position-absolute top-50 start-50 translate-middle">
                <form action="add" method="post" class="row bg-light d-flex justify-content-end">
                    <div class="col-12 my-2 text-dark">
                        <label class="form-label" for="nom">Name</label>
                        <input class="form-control" id="nom" name="nom" type="text">
                    </div>
                    <div class="col-12 my-2 text-dark">
                        <label class="form-label" for="cat">Category</label>
                        <input class="form-control" id="cat" name="cat" type="text">
                    </div>
                    <div class="col-12 my-2 text-dark">
                        <label class="form-label" for="description">Recipe ingredients</label>
                        <textarea class="form-control" id="description" name="description" rows="5"></textarea>
                    </div>
                    <div class="col-2 my-2">
                        <button class="btn btn-primary w-100" type="submit">Add</button>
                    </div>
                </form>
            </div>
        </div>
    </section>
</main>
<c:import url="footer.jsp"></c:import>
</body>
</html>
