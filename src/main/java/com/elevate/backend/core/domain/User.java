package com.elevate.backend.core.domain;

import jakarta.persistence.Entity;

import java.util.regex.Pattern;

public class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private String validateEmail(String email) {
        String regex ="^[A-Za-z0-9+_.-]+@(.+)$";
        if(!Pattern.compile(regex).matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email");
        }
        return email;
    }

    public String getName() {return name; }

    public String getEmail() {return email; }
}
