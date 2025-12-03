package com.SpringBegin.learn_spring_framework.playstations;

import com.SpringBegin.learn_spring_framework.game.GameRunner;
import com.SpringBegin.learn_spring_framework.game.GamingConsole;
import com.SpringBegin.learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayStationConfig {
    // Whatever the methods returned under @Bean annotation they are all considered as Beans in the context
    @Bean
    public GamingConsole game() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    // passing bean as an argument
    public GameRunner gameRunner(GamingConsole game) {

        return new GameRunner(game);
    }
}
