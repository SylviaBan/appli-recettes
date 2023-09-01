package com.example.projet_sitecuisine_groupe2_20230901.entity;

import javax.persistence.*;
import java.time.LocalDate;
import com.example.projet_sitecuisine_groupe2_20230901.entity.Recipe;
@Entity
@Table(name="datedrecipes")
public class DatedRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "recipe")
    private Integer recipe;
    @Column(name = "date")
    private LocalDate date;

    public DatedRecipe(Integer id, Integer recipe, LocalDate date) {
        this.id = id;
        this.recipe = recipe;
        this.date = date;
    }

    public DatedRecipe(Integer recipe, LocalDate date) {
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

    public Integer getRecipe() {
        return recipe;
    }

    public void setRecipe(Integer recipe) {
        this.recipe = recipe;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
