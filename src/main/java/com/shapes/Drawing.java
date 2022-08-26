package com.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        Triangle t = (Triangle) ac.getBean("tri");
        Triangle t2 = (Triangle) ac.getBean("tri2");
        Triangle t3 = (Triangle) ac.getBean("tri3");
        System.out.println(t + "\n" + t2 + "\n" + t3);
        t.draw();
    }
}