package com.example.tdrevision.servlets;

import com.example.tdrevision.emf.ConnexionDb;
import com.example.tdrevision.entity.Game;
import com.example.tdrevision.repository.GameRepository;
import com.example.tdrevision.repository.UserRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListGamesServlet", value = "/list")
public class ListGamesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Connexion à la bdd
        GameRepository gameRepo = new GameRepository(ConnexionDb.getInstanceEmf());

        List<Game> games = gameRepo.findAll();
        request.setAttribute("games", games);

        // Affichage de la Vue jsp
        request.getRequestDispatcher("/WEB-INF/listGames.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/listGames.jsp")
                .forward(request, response);
    }
}
