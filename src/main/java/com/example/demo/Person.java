package com.example.demo;

public class Person {

    private String name;
    private String surname;
    private String motto;

    public Person(String name, String surname, String motto) {
        this.name = name;
        this.surname = surname;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
