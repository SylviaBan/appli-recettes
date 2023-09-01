//package com.example.projet_sitecuisine_groupe2_20230901.servlets;
//
//import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/Recipe/Add")
//public class AddRecipeServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/").forward(request,response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    String name = request.getParameter("");
//    String description = request.getParameter("");
//
//        Recipe recipe = new Recipe(category,name,recipe_method);
//
//    }
//}