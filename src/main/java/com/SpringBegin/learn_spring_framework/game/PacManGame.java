package com.SpringBegin.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

    /* SPRING CREATES THIS CLASS OBJECT (BEAN) FOR US
    * CREATING NEW OBJECT WITHOUT DOING IT BY OURSELVES BUT BY SPRING
    * IT IS DONE SO BY @Component in PacMan class
    *  */

    @Override
    public String toString() {
        return "PacMan -> The MindBending 2D Game";
    }

    @Override
    public void up() {
        System.out.println("Move up");
    }

    @Override
    public void down() {
        System.out.println("Move Down");
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
