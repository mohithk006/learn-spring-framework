package com.SpringBegin.learn_spring_framework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// THE FOLLOWING IS THE DEMONSTRATION OF FIELD INJECTION

@Component
class DependencyUser {
    // below 2 lines demonstrate FIELD INJECTION
    @Autowired
    Dependency1 d1;
    @Autowired
    Dependency2 d2;

    // The below 2 setters are not necessary as wiring the fields is automatically done by spring context

    public void setD2(Dependency2 d2) {
        this.d2 = d2;
    }

    public void setD1(Dependency1 d1) {
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return "DependencyUser is using " + d1 + " and " + d2;
    }
}

@Component
class Dependency1 {
    @Override
    public String toString() {
        return "Dependency1";
    }
}

@Component
class Dependency2 {
    @Override
    public String toString() {
        return "Dependency2";
    }
}

@Configuration  @ComponentScan
public class DIApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (DIApplication.class);

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(DependencyUser.class));
    }
}
