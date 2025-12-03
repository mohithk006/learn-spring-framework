package com.SpringBegin.learn_spring_framework.playstations;

import com.SpringBegin.learn_spring_framework.game.GameRunner;
import com.SpringBegin.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
*   WHAT'S HAPPENING OVER IN THIS FILE?
* IN THIS FILE SPRING IS NOT ONLY CREATING OBJECTS FOR US
* BUT ALSO MANAGING THEM AND PERFORMING AUTOWIRING
* USING THE BELOW 2 ANNOTATIONS
*
* EARLIER WE USED TO CREATE A CONFIGURATION AND CREATE BEANS IN IT BUT NOW WITH
* TEH ADVENT OF COMPONENT, WE NEED NOT BOTHER ABOUT IT*/

@Configuration
@ComponentScan("com.SpringBegin.learn_spring_framework.game")
// below is in the same package as the above so we technically don't need the below annotation for GameRunner class
// BEST PRACTICE: make sure all the components are in the same package
@ComponentScan("com.SpringBegin.learn_spring_framework.game")
public class PlayStationApp02Beans {

    public static void main(String[] args) {

        // Component Scan annotation lets Spring know where to find the bean in the
        // container which manages, configures, and creates beans for us
        var context = new AnnotationConfigApplicationContext
                (PlayStationApp02Beans.class);

        context.getBean(GamingConsole.class).left();

        // spring autowired in to the gaming console without us
        // having the need of creating the instance
        context.getBean(GameRunner.class).run();
    }
}
