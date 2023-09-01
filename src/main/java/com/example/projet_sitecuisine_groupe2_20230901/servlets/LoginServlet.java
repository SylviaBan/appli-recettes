package com.example.tdrevision.servlets;

import com.example.tdrevision.emf.ConnexionDb;
import com.example.tdrevision.entity.User;
import com.example.tdrevision.repository.UserRepository;

import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichage de la Vue jsp
        request.getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Déclaration variables
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Connexion à la bdd
        UserRepository userRepo = new UserRepository(ConnexionDb.getInstanceEmf());

        try {
            userRepo.findUser("Sylvia","blablabla");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "Compte déjà existant.");
            request.getRequestDispatcher("/WEB-INF/login.jsp");
        }

        response.sendRedirect(request.getContextPath() + "/list");
    }
}