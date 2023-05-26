package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.demo")
public class AppConfig {

    @Bean
    public IMember getMember() {return new Member();}

    @Bean
    public String getName()
    {
        return "Picnic club";
    }

    @Bean
    public Person person() {return new Person("Maria","Boleyn","Hide in the shadows");}




}
