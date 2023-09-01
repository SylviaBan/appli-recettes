package com.example.tdrevision.servlets;

import com.example.tdrevision.emf.ConnexionDb;
import com.example.tdrevision.entity.User;
import com.example.tdrevision.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichage de la Vue jsp
        request.getRequestDispatcher("/WEB-INF/register.jsp")
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
            userRepo.create(new User(login, password));
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "Compte déjà existant.");
            request.getRequestDispatcher("/WEB-INF/register.jsp");
        }

        response.sendRedirect(request.getContextPath() + "/login");
    }
}