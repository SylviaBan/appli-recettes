package com.example.projet_sitecuisine_groupe2_20230901.repository;

import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;

import javax.persistence.EntityManagerFactory;

public class RecipeRepository extends EntityRepository <Recipe, Integer>{

        public RecipeRepository(EntityManagerFactory emf)
    {
        super(emf, Recipe.class);
    }
}
