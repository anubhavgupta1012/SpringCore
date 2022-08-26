package com.shapes.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
        Triangle t = (Triangle) ac.getBean("ABC");
        t.draw();
    }
}
