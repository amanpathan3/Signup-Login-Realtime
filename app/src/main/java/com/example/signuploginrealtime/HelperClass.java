package com.example.signuploginrealtime;

public class HelperClass {
    String name, email, username, password;

    public HelperClass() {
    }

    public HelperClass(String password, String username, String email, String name) {
        this.password = password;
        this.username = username;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
