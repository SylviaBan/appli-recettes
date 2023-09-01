package com.example.projet_sitecuisine_groupe2_20230901;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Database :
 * tentative de singleton pour éviter d'instancier plusieurs EntityManagerFactory emf
 */
public class Database {
    private static Database instance;
    private final EntityManagerFactory emf;

    private Database() {
        this.emf = Persistence.createEntityManagerFactory("MY_PU");
    }

    public static EntityManagerFactory getInstanceEmf() {
        if (instance == null) {
            instance = new Database();
        }
        return instance.getEmf();
    }

    private EntityManagerFactory getEmf() {
        return this.emf;
    }
}
