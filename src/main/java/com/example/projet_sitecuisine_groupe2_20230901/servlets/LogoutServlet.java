package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/logout.jsp").forward(request, response);

        // Récupérer la session de l'utilisateur (s'il y en a une)
        HttpSession session = request.getSession(false);

        // Si une session existe, la déconnecter (invalider)
        if (session != null) {
            session.invalidate();
        }

        // Rediriger l'utilisateur vers la page d'accueil
        response.sendRedirect("home.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}