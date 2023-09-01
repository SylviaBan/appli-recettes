package com.example.tdrevision.repository;

import com.example.tdrevision.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class UserRepository extends EntityRepository<User, Integer> {
    public UserRepository(EntityManagerFactory emf) {

        super(emf, User.class);
    }

    public User findUser(String login, String password) {
        EntityManager em = super.emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();// Début

        User u = null;
        try {
            TypedQuery<User> tq = em.createQuery(
                    "SELECT u FROM User u WHERE u.login = :login AND u.password = :password", User.class);
            tq.setParameter("login", login);
            tq.setParameter("password", password);

            u = tq.getSingleResult();
        } catch (Exception e) {

        }

        tx.commit();// Fin
        em.close();

        return u;
    }
}
