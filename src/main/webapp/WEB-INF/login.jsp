<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
    <c:import url="head.jsp"></c:import>
</head>
<body class="container my-custom-bg">
<c:import url="header.jsp"></c:import>
<main>
    <section class="py-5">
        <div class="container py-5">
            <div class="row d-flex justify-content-center gy-5 mt-4">
                <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                    <div class="card my-card-bg" style="width: 100%">
                        <div class="card-header d-flex justify-content-center">
                            <i class="fas fa-user fa-3x me-3" style="color: #ffffff;"></i>
                        </div>

                        <div class="card-body d-flex justify-content-center">
                            <h5 class="card-title text-light">Please sign in</h5>
                        </div>
                        <form action="login" method="post" class="row">
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="login">Login</label>-->
                                <input class="form-control" id="email" name="email" type="email">
                            </div>
                            <div class="col-12 my-2">
                                <!--<label class="form-label" for="password">Password</label>-->
                                <input class="form-control" id="password" name="password" type="password">
                            </div>
                            <div class="col-6 my-2">
                                <button class="btn btn-primary w-100" type="submit">Sign in</button>
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
