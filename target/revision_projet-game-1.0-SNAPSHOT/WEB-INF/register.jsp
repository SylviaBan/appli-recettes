<%--
  Created by IntelliJ IDEA.
  User: sylwia
  Date: 01/09/2023
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Register</title>
    <c:import url="head.jsp"></c:import>
</head>

<body class="container my-custom-bg">
<c:import url="header.jsp"></c:import>
<main>
    <section class="py-5">
        <div class="container">
            <div class="row d-flex justify-content-center gy-5 mt-4">
                <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                    <div class="card my-card-bg" style="width: 100%">
                        <div class="card-header d-flex justify-content-center">
                            <i class="fas fa-address-card fa-3x me-3" style="color: #ffffff;"></i>
                        </div>

                        <div class="card-body d-flex justify-content-center">
                            <h5 class="card-title text-light">Please register</h5>
                        </div>
                        <form action="register" method="post" class="row">
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="login">Login</label>-->
<<<<<<< HEAD
                                <input class="form-control" name="firstname" type="text" value="John">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="login">Login</label>-->
                                <input class="form-control" name="name" type="text" value="Doe">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="login">Login</label>-->
                                <input class="form-control" name="email" type="email" value="john.doe@gmail.com">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="password">Password</label>-->
                                <input class="form-control" name="password" type="password" value="********">
=======
                                <input class="form-control" name="firstname" type="text">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="login">Login</label>-->
                                <input class="form-control" name="name" type="text">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="password">Password</label>-->
                                <input class="form-control" name="password" type="password">
>>>>>>> a6eeb3b4fe6d599d4890e9362e7ab297495dcad5
                            </div>
                            <div class="col-6 my-2">
                                <button class="btn btn-primary w-100" type="submit">Register</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>
<c:import url="footer.jsp"></c:import>
</body>
</html>