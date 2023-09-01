package com.example.projet_sitecuisine_groupe2_20230901.repository;

import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class RecipeRepository extends EntityRepository <Recipe, Integer>{
        public RecipeRepository(EntityManagerFactory emf)
    {
        super(emf, Recipe.class);
    }

    public List<Recipe> findByName(String name) {
        List<Recipe> recipes= null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            TypedQuery<Recipe> q = em.createQuery("SELECT r FROM Recipe WHERE r.name= :name", Recipe.class);
            q.setParameter("name", name);

            recipes = q.getResultList();

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
        return recipes;
    }
}
