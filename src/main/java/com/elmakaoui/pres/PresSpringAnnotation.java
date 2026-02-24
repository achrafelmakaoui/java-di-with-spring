package com.elmakaoui.pres;

import com.elmakaoui.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.elmakaoui");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Res:"+ metier.calcul());
    }
}
