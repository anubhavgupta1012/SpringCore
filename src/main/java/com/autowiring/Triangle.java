package com.autowiring;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle {
    Points pointA, pointB, pointC;

    public Triangle(Points pointA, Points pointB, Points pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    /*    public void setPointA(Points pointA) {
            this.pointA = pointA;
        }

        public void setPointB(Points pointB) {
            this.pointB = pointB;
        }

        public void setPointC(Points pointC) {
            this.pointC = pointC;
        }*/
    public Points getPointA() {
        return pointA;
    }

    public Points getPointB() {
        return pointB;
    }

    public Points getPointC() {
        return pointC;
    }

    public void draw() {
        System.out.println("Point A(" + pointA.getX() + "\t" + pointA.getY() + ")");
        System.out.println("Point B(" + pointB.getX() + "\t" + pointB.getY() + ")");
        System.out.println("Point C(" + pointC.getX() + "\t" + pointC.getY() + "))");
    }

    @PostConstruct
    public void test1() {
        System.out.println("before");
    }

    @PreDestroy
    public void test2() {
        System.out.println("before");
    }
}
