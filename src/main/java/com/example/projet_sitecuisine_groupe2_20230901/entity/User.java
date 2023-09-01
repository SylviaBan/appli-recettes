package com.example.tdrevision.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
@SequenceGenerator(name="user_gen",sequenceName="user_seq", initialValue = 1, allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(generator = "user_gen")
    private Long id;

    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
