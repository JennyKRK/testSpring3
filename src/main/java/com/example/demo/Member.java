package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Member implements IMember{

    Person person;

    public Member(){

    }


    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public void printSomething() {
        System.out.println("My name is " + person.getName() + " " + person.getSurname());
        System.out.println("This is my motto: " + person.getMotto());
    }
}
