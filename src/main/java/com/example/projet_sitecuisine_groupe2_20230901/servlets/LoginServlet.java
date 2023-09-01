package com.example.projet_sitecuisine_groupe2_20230901.servlets;

import com.example.projet_sitecuisine_groupe2_20230901.emf.ConnexionDb;
import com.example.projet_sitecuisine_groupe2_20230901.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class LoginServlet extends HttpServlet {
    EntityManagerFactory emf = ConnexionDb.getInstanceEmf();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("firstname", "Boris");

        // Affiche la page lorsque /login est appelée
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Récupération des informations du formulaire
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User userFound = null;
        EntityManager em = emf.createEntityManager();
        try {
            // NOTE : email used as a username
            TypedQuery<User> userQuery = em.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class);
            userQuery.setParameter("email", email);
            userFound = userQuery.getSingleResult();
            if (userFound != null && userFound.getPassword().equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("email", email);
                resp.sendRedirect(req.getContextPath() + "/home"); //TODO : vérifier si /home pertinent comme path vers page accueil
            } else {
                req.setAttribute("error", "Bad credentials");
                req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
            }
        } catch (NoResultException e) {
            req.setAttribute("error", "Bad credentials");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
        }
        em.close();
    }
}
