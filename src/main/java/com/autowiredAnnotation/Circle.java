package com.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
    Points centre;

    public Points getCentre() {
        return centre;
    }

    @Autowired
    @Qualifier("abc")
    public void setCentre(Points centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Center of the Circle is  (" + centre.getX() + "," + centre.getY() + " )");
    }
}