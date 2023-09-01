package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import com.example.projet_sitecuisine_groupe2_20230901.emf.ConnexionDb;
import com.example.projet_sitecuisine_groupe2_20230901.entity.User;
import com.example.projet_sitecuisine_groupe2_20230901.repository.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

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
        String firstname = request.getParameter("firstname");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Connexion à la bdd
        UserRepository userRepo = new UserRepository(ConnexionDb.getInstanceEmf());

        try {
            userRepo.create(new User(firstname, name, email, password));
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "This account already exists.");
            request.getRequestDispatcher("/WEB-INF/register.jsp");
        }

        response.sendRedirect(request.getContextPath() + "/home");
    }
}