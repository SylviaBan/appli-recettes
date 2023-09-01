package com.example.tdrevision.servlets;

import com.example.tdrevision.emf.ConnexionDb;
import com.example.tdrevision.entity.Game;
import com.example.tdrevision.entity.User;
import com.example.tdrevision.repository.GameRepository;
import com.example.tdrevision.repository.UserRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddGameServlet", value = "/add")
public class AddGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/addGame.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Déclaration variables
        String nom = request.getParameter("nom");
        String description = request.getParameter("description");

        // Connexion à la bdd
        GameRepository gameRepo = new GameRepository(ConnexionDb.getInstanceEmf());

        try {
            gameRepo.create(new Game(nom, description));
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "Jeu déjà existant.");
            request.getRequestDispatcher("/WEB-INF/addGame.jsp");
        }

        // Redirect
        response.sendRedirect(request.getContextPath() + "/list");

    }
}