package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import com.example.projet_sitecuisine_groupe2_20230901.emf.ConnexionDb;
import com.example.projet_sitecuisine_groupe2_20230901.repository.RecipeRepository;
import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddRecipesServlet", value = "/add")
public class AddRecipesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/addRecipe.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Déclaration variables
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String recipe_method = request.getParameter("recipe_method");

        // Connexion à la bdd
        RecipeRepository recipeRepo = new RecipeRepository(ConnexionDb.getInstanceEmf());

        try {
            recipeRepo.create(new Recipe(name, category, recipe_method));
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "Recipe already exists.");
            request.getRequestDispatcher("/WEB-INF/addRecipe.jsp");
        }

        // Redirect
        response.sendRedirect(request.getContextPath() + "/listRecipe");

    }
}