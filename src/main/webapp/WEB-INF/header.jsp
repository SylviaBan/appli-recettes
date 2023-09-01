<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
  <!-- 1. La nav barre => la barre de navigation-->
  <nav class="navbar navbar-expand-md my-card-bg fixed-top">
    <!-- 2. Container => pour y définir les div-->
    <div class="container fluid">
      <a class="navbar-brand" href="#">
        <i class="fas fa-utensils fa-3x me-3" style="color: #ffffff;"></i>
      </a>
      <div class="collapse navbar-collapse justify-content-start">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link bg-warning text-light" href="home">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="register">Register</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="login">Login</a>
          </li>
          <li class="nav-item bg-primary rounded-3">
            <a class="nav-link text-light" href="list">Recipes</a>
          </li>
        </ul>
      </div>
      <div class="collapse navbar-collapse justify-content-end">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link text-light" href="add">Add</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="search">Search</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="profil">Profile</a>
          </li>
          <li class="nav-item bg-danger rounded-3">
            <a class="nav-link text-light" href="logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>
