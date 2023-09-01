package com.example.projet_sitecuisine_groupe2_20230901.entity;

import java.awt.*;


public class User {
    private Integer id;
    private String name;
    private String firstname;
    private String email;
    private Image photo;
    private String password;
    private List<DatedRecipe> cookedRecipe;

    public User(Integer id, String name, String firstname, String email, Image photo, String password, List<DatedRecipe> cookedRecipe) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.cookedRecipe = cookedRecipe;
    }

    public User(String name, String firstname, String email, Image photo, String password, List<DatedRecipe> cookedRecipe) {
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.cookedRecipe = cookedRecipe;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<DatedRecipe> getCookedRecipe() {
        return cookedRecipe;
    }

    public void setCookedRecipe(List<DatedRecipe> cookedRecipe) {
        this.cookedRecipe = cookedRecipe;
    }
}
