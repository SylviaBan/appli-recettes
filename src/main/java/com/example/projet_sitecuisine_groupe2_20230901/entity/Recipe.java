package com.example.projet_sitecuisine_groupe2_20230901.entity;

import javax.persistence.*;

@Entity// Table pour hibernate
@Table(name="recipe")// Nom de la table dans la bdd
@SequenceGenerator(name="recipe_gen",sequenceName="recipe_seq",initialValue=1,allocationSize=1)
public class Recipe {

    @Id// Clé primaire
    @GeneratedValue(generator = "game_gen")
    private Integer id;

    @Column(name = "category") // Nom de la colonne dans la table
    private String category;

    @Column(name = "name")// Nom de la colonne dans la table
    private String name;

    @Column(name = "recipe_method")// Nom de la colonne dans la table
    private String recipe_method;


    @Column(name = "author") // Nom de la colonne dans la table
    private User user;

    public Recipe() {}

    public Recipe(String category, String name, String recipe_method, String user) {
        this.category = category;
        this.name = name;
        this.recipe_method = recipe_method;
        this.user = user;
    }

    public Recipe(Integer id, String category, String name, String recipe_method, String user) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.recipe_method = recipe_method;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getRecipe_method() {
        return recipe_method;
    }

    public User getUser() {
        return user;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecipe_method(String recipe_method) {
        this.recipe_method = recipe_method;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
