package com.beanpostprocessor;

public class Triangle {
	Points pointA, pointB, pointC;

	public Points getPointA() {
		return pointA;
	}

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}

	public Points getPointB() {
		return pointB;
	}

	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}

	public Points getPointC() {
		return pointC;
	}

	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A(" + pointA.getX() + "\t" + pointA.getY() + ")");
		System.out.println("Point B(" + pointB.getX() + "\t" + pointB.getY() + ")");
		System.out.println("Point C(" + pointC.getX() + "\t" + pointC.getY() + ")");
	}


	
}
