package com.example.projet_sitecuisine_groupe2_20230901.repository;

import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
import com.example.projet_sitecuisine_groupe2_20230901.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepository extends EntityRepository <User,Integer>{
    public UserRepository(EntityManagerFactory emf)
    {
        super(emf, User.class);
    }

    public List<User> findByName(String name) {
        List<User> users= null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            TypedQuery<User> q = em.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);
            q.setParameter("name", name);

            users = q.getResultList();

            tx.commit();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return users;
    }
}
