package com.example.projet_sitecuisine_groupe2_20230901.entity;

import java.time.LocalDate;

public class DatedRecipe {
    private Integer id;
    private Recipe recipe;
    private LocalDate date;

    public DatedRecipe(Integer id, Recipe recipe, LocalDate date) {
        this.id = id;
        this.recipe = recipe;
        this.date = date;
    }

    public DatedRecipe(Recipe recipe, LocalDate date) {
        this.recipe = recipe;
        this.date = date;
    }

    public DatedRecipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
