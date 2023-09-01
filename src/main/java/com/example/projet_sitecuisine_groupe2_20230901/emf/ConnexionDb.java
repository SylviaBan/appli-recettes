package com.example.projet_sitecuisine_groupe2_20230901.emf;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionDb {

    private static ConnexionDb instance;
    private final EntityManagerFactory emf;

    private ConnexionDb() {
        this.emf = Persistence.createEntityManagerFactory("MY_PU");
    }
    private EntityManagerFactory getEmf() {
        return this.emf;
    }

    public static EntityManagerFactory getInstanceEmf() {
        if (instance == null) {
            instance = new ConnexionDb();
        }
        return instance.getEmf();
    }
}