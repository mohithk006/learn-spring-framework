package com.SpringBegin.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;
    public GameRunner(@Qualifier("ContraGameQualifier") GamingConsole game) {

        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: " + game.toString());

        game.left();
        game.right();
        game.down();
        game.up();
    }
}
