package com.aop.main;

public class ShapeService {
    private Circle c;
    private Triangle t;

    public Circle getC() {
        return c;
    }

    public void setC(Circle c) {
        this.c = c;
    }

    public Triangle getT() {
        return t;
    }

    public void setT(Triangle t) {
        this.t = t;
    }

    public void xyz(String n) {
        //System.out.println("Kuch nhi");
    }
}
