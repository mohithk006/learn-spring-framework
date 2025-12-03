package com.SpringBegin.learn_spring_framework.examples.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// By default all the beans created in the framework are singletons
    // that means the scope by default is singleton
class NormalClass {


}
@Component
//Inside ConfigurableBeanFactory: String SCOPE_PROTOTYPE = "prototype";
//String SCOPE_SINGLETON = "singleton";
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}


@Configuration  @ComponentScan
public class ScopeLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (ScopeLauncherApplication.class);

        /*
        * Below we can see that NormalClass has only one instance initialized but
        * prototype class has various objects created in the heap
        * when you want different bean instance to be created everytime you refer it
        * then set the scope of the component as prototype*/
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));

    }
}
