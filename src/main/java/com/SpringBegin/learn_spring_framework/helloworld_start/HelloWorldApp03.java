package com.SpringBegin.learn_spring_framework.helloworld_start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApp03 {
    public static void main(String[] args) {
        //Spring IoC Container -> It is the core container and central brain of a spring application
       // Spring IoC Container -> 2 types: Bean Factory, Application Context (widely used)

//        The Spring Container (ApplicationContext) is the kitchen.
//        The Spring Beans are the ingredients or dishes prepared by the kitchen.

        var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("someRandomMethodName"));
        System.out.println(context.getBean("personWay2"));

//        System.out.println(context.getBean(Person.class));

        /*
         * @Primary: Marks one bean as the default choice to be autowired
         * when Spring finds multiple beans of the same type.
         * @Qualifier: Explicitly names exactly which specific bean to use
         * at the point of injection, overriding any @Primary defaults.
         *
         * WHEN TO USE WHAT:
         * @Primary -> WHEN A BEAN SHOULD BE GIVEN PREFERENCE WHEN MULTIPLE CANDIDATES ARE QUALIFIED
         * @Qualifier -> WHEN A SPECIFIC BEAN SHOULD BE AUTO-WIRED -> name of the bean can be used as qualifier*/

    }
}
