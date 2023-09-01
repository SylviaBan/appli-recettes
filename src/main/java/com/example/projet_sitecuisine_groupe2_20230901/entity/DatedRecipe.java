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

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public DatedRecipe(Integer id, Integer recipe, LocalDate date, User user) {
        this.id = id;
        this.recipe = recipe;
        this.date = date;
        this.user = user;
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

    public Integer getRecipe() {
        return recipe;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public void setRecipe(Integer recipe) {
        this.recipe = recipe;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
