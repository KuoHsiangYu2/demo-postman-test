package com.hsiangyu.example.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("USERNAME")
    private String username = "";

    @JsonProperty("AGE")
    private int age = 0;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", age=" + age + "]";
    }

}
