package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {

        ApplicationContext ap = new ClassPathXmlApplicationContext("Spring1.xml");
        ShapeService ss = (ShapeService) ap.getBean("shape");
        ss.xyz("Dheeraj");
        Circle c = ss.getC();
        System.out.println(c.getName());
        //System.out.println("================================");
        ss.getC().ABC();
    }
}
