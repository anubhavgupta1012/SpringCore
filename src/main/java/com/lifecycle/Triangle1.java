
package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle1 implements InitializingBean, DisposableBean  {
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

	
	public void destroy() throws Exception {
		System.out.println("DisposableBean from Triangle1");

	}

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitialisingBean from Triangle1");

	}
	
	public void initm() {
		System.out.print("user init run from Triangle1\n");
	}
	public void desm() {
		System.out.print("user destroy run from Triangle1");
	} 
	
	
}
