package com.SpringBegin.learn_spring_framework.helloworld_start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };

// Configure the things (beans) that we want Spring to manage
// This is to be launched in main()

/*
* @Configuration annotation in Spring is one of the most important annotations.
* It indicates that a class contains @Bean definition methods,
* which the Spring container can process to generate Spring Beans for use
* in the application. This annotation is part of the Spring Core framework.
* */
@Configuration
public class HelloWorldConfig {

    @Bean
    public String name() {
        return "Mohith";
    }

    @Bean
    public int age() {
        return 22;
    }

    // Customize Bean names according to your needs as follows
    @Bean(name="someRandomMethodName")
    public Person person() {
        return new Person("Bob", 42);
    }

    // Using existing beans to create new bean
    // 2 ways: Wiring with method calls and Wiring using method parameters
    @Bean
    public Person personWay1() {
        return new Person(name(), age());
    }

    @Bean
    public Person personWay2(String name, int age) {
        return new Person(name, age);
    }

}
