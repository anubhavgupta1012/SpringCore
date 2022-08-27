package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowiring.xml");
        Triangle t = (Triangle) ac.getBean("abc");
        Triangle t2 = (Triangle) ac.getBean("abc");
        Triangle t3 = (Triangle) ac.getBean("abc");
        System.out.println(t + "\n" + t2 + "\n" + t3);
        t.draw();
    }
}
