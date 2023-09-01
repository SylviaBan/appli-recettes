package com.example.projet_sitecuisine_groupe2_20230901.entity;

import javax.persistence.*;
import java.util.List;
import com.example.projet_sitecuisine_groupe2_20230901.entity.DatedRecipe;
import javafx.scene.image.Image;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")// Nom de la colonne dans la table
    private String name;
    @Column(name = "firstname")// Nom de la colonne dans la table
    private String firstname;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "photo")
    private String photo;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<DatedRecipe> cookedRecipe;
    @OneToMany(mappedBy = "user")
    private List<Recipe> myRecipe;

    public User(Integer id, String name, String firstname, String email, String photo, String password, List<DatedRecipe> cookedRecipe, List<Recipe> myRecipe) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.cookedRecipe = cookedRecipe;
        this.myRecipe = myRecipe;
    }


    public User(String name, String firstname, String email, String photo, String password, List<DatedRecipe> cookedRecipe, List<Recipe> myRecipe) {
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.cookedRecipe = cookedRecipe;
        this.myRecipe = myRecipe;
    }


    public User(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {return photo;}

    public String getPassword() {
        return password;
    }

    public List<DatedRecipe> getCookedRecipe() {
        return cookedRecipe;
    }

    public List<Recipe> getMyRecipe() {
        return myRecipe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoto(String photo) {this.photo = photo;}

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCookedRecipe(List<DatedRecipe> cookedRecipe) {
        this.cookedRecipe = cookedRecipe;
    }

    public void setMyRecipe(List<Recipe> myRecipe) {
        this.myRecipe = myRecipe;
    }
}
