package com.example.projet_sitecuisine_groupe2_20230901;

import com.example.projet_sitecuisine_groupe2_20230901.entity.DatedRecipe;
import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
import com.example.projet_sitecuisine_groupe2_20230901.entity.User;
import com.example.projet_sitecuisine_groupe2_20230901.repository.DatedRecipeRepository;
import com.example.projet_sitecuisine_groupe2_20230901.repository.RecipeRepository;
import com.example.projet_sitecuisine_groupe2_20230901.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Connecter à la bdd
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MY_PU");
        EntityManager em = null;
//
        RecipeRepository recipeRepo;
        recipeRepo = new RecipeRepository(emf);

        UserRepository userRepo;
        userRepo = new UserRepository(emf);

        DatedRecipeRepository datRecipRepo;
        datRecipRepo = new DatedRecipeRepository(emf);

        User u1= new User("Steeve","Lowenski");
        userRepo.create(u1);
//
        Recipe rec1= new Recipe("dessert test","Tarte au pomme test","Dans un fond de tarte ajouter appareil et pommes fraichement coupés",u1);
        recipeRepo.create(rec1);

//        Recipe rec1= new Recipe("dessert test","Tarte au pomme test","Dans un fond de tarte ajouter appareil et pommes fraichement coupés");
//        recipeRepo.create(rec1);

        DatedRecipe drec1 = new DatedRecipe(1, LocalDate.now());
        datRecipRepo.create(drec1);

        userRepo.findByName("Steeve");
        System.out.println(userRepo.findByName("Steeve"));

    }
}
