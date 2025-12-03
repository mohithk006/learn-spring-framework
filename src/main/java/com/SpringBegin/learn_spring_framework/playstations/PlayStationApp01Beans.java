package com.SpringBegin.learn_spring_framework.playstations;

import com.SpringBegin.learn_spring_framework.game.GameRunner;
import com.SpringBegin.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlayStationApp01Beans {
    public static void main(String[] args) {
        // Java Application context
        // Pass in the configuration class  into the context
        var context = new AnnotationConfigApplicationContext
                (PlayStationConfig.class);

        context.getBean(GamingConsole.class).right();
        context.getBean(GamingConsole.class).left();

        context.getBean(GameRunner.class).run();
    }
}