package com.shapes.collection;

import java.util.List;

public class Triangle {
    private List<Points> points;


    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }


    public void draw() {
        for (Points p : points)
            System.out.println(p.getX() + "\t" + p.getY());
    }
}
