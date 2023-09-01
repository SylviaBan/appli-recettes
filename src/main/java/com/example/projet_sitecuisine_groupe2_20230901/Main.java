package com.example.projet_sitecuisine_groupe2_20230901;

import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
import com.example.projet_sitecuisine_groupe2_20230901.repository.RecipeRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Connecter à la bdd
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MY_PU");
        EntityManager em = null;

        RecipeRepository recipeRepo;
        recipeRepo = new RecipeRepository(emf);

//        Recipe rec1= new Recipe("dessert test","Tarte au pomme test","Dans un fond de tarte ajouter appareil et pommes fraichement coupés","Steeve Test");
//        recipeRepo.create(rec1);

//        recipeRepo;


    }
}
