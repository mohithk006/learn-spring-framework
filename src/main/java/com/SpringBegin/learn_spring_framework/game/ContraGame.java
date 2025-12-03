package com.SpringBegin.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// when we have multiple beans of the same type (i.e GamingConsole type, then by default
// Mario bean is given priority while auto wiring (coz of @Primary on it) But how to give control to this bean?
// Using @Qualifier -> we autowire it directly in game runner class
@Qualifier("ContraGameQualifier")
public class ContraGame implements GamingConsole {
    @Override
    public String toString() {
        return "Contra -> The Game for Grown ups";
    }

    @Override
    public void up() {
        System.out.println("Shoot the Gun");
    }

    @Override
    public void down() {
        System.out.println("Crouch");
    }

    @Override
    public void left() {
        System.out.println("Move Left");
    }

    @Override
    public void right() {
        System.out.println("Move Right");
    }
}
