package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
import com.example.projet_sitecuisine_groupe2_20230901.repository.RecipeRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListRecipesServlet", value = "/list")
public class ListRecipesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RecipeRepository recipeRepo = new RecipeRepository(com.example.projet_sitecuisine_groupe2_20230901.emf.ConnexionDb.getInstanceEmf());

        List<Recipe> recipes = recipeRepo.findAll();
        request.setAttribute("recipes", recipes);

        request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
    }
}