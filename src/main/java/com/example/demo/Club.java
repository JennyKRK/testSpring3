package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Club {

    private IMember member;
    private String name;

    public Club(IMember member, String name) {
        this.member = member;
        this.name = name;
    }

    public void printSomething(){
        System.out.println("Hello. We are club " + this.name);
        System.out.println("Nice to meet you");
        member.printSomething();
    }
}
