package com.SpringBegin.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration  @ComponentScan
public class SpringContextApplicationLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (SpringContextApplicationLauncher.class);


        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}