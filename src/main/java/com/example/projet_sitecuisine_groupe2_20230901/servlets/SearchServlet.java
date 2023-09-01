package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import com.example.projet_sitecuisine_groupe2_20230901.repository.RecipeRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("name");
        RecipeRepository recipeRepo = new RecipeRepository(com.example.projet_sitecuisine_groupe2_20230901.emf.ConnexionDb.getInstanceEmf());

        request.getRequestDispatcher("WEB/INF/searchRecipe.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}