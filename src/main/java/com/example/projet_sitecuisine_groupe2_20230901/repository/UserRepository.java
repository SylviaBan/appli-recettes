package com.example.projet_sitecuisine_groupe2_20230901.repository;

import com.example.projet_sitecuisine_groupe2_20230901.entity.User;

import javax.persistence.EntityManagerFactory;

public class UserRepository extends EntityRepository <User,Integer>{
    public UserRepository(EntityManagerFactory emf) { super(emf, User.class);}

}
