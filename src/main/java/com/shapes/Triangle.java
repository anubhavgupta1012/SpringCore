package com.shapes;

public class Triangle {
    Points point1, point2, point3;

    public Points getPoint1() {
        return point1;
    }

    public void setPoint1(Points point1) {
        this.point1 = point1;
    }

    public Points getPoint2() {
        return point2;
    }

    public void setPoint2(Points point2) {
        this.point2 = point2;
    }

    public Points getPoint3() {
        return point3;
    }

    public void setPoint3(Points point3) {
        this.point3 = point3;
    }


    public void draw() {
        System.out.println("Point A(" + point1.getX() + "\t" + point1.getY() + ")");
        System.out.println("Point B(" + point2.getX() + "\t" + point2.getY() + ")");
        System.out.println("Point C(" + point3.getX() + "\t" + point3.getY() + ")");
    }
}
