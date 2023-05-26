package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CodeRunner {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Club club = context.getBean(Club.class);
        Person person = context.getBean(Person.class);
        club.printSomething();
        context.close();


    }

}
