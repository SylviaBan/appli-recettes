package com.example.projet_sitecuisine_groupe2_20230901;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Connecter à la bdd
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MY_PU");


    }
}
