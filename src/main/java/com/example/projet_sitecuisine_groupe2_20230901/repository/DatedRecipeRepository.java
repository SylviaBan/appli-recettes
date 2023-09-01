package com.example.projet_sitecuisine_groupe2_20230901.repository;

import com.example.projet_sitecuisine_groupe2_20230901.entity.DatedRecipe;

import javax.persistence.EntityManagerFactory;

public class DatedRecipeRepository extends EntityRepository <DatedRecipe, Integer>{
    public DatedRecipeRepository(EntityManagerFactory emf)
    {
        super(emf, DatedRecipe.class);
    }

}
