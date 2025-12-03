package com.SpringBegin.learn_spring_framework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

// THE FOLLOWING IS THE DEMONSTRATION OF SETTER INJECTION & CONSTRUCTOR INJECTION

@Component
class DependencyUserClass {

    private DependencyA d1;
    private DependencyB d2;

////    CONSTRUCTOR INJECTION
//    @Autowired  -> when you use constructor injection @Autowired is not mandatory
//    public DependencyUserClass(DependencyA d1, DependencyB d2) {
//        System.out.println("Constructor Injection started");
//        this.d1 = d1;
//        this.d2 = d2;
//    }

    //    SETTER INJECTION
    @Autowired
    public void setD2(DependencyB d2) {
        System.out.println("setD2 method is being executed");
        this.d2 = d2;
    }

//    SETTER INJECTION
    @Autowired
    public void setD1(DependencyA d1) {
        System.out.println("setD1 method is being executed");
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return "DependencyUserClass is using " + d1 + " and " + d2;
    }
}

@Component
class DependencyA {
    @Override
    public String toString() {
        return "DependencyA";
    }
}

@Component
class DependencyB {
    @Override
    public String toString() {
        return "DependencyB";
    }
}

@Configuration  @ComponentScan
public class DIApplication02 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (DIApplication02.class);

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(DependencyUserClass.class));
    }
}