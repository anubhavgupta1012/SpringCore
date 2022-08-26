package com.autowiredAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowiredAnnotation.xml");
        Shape t = (Shape) ac.getBean("circle");
        t.draw();
    }
}
