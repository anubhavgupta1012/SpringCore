package com.useInterfaces;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	 Points centre;

	public Points getCentre() {
		return centre;
	}
	@Required
	public void setCentre(Points centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println("Center of the Circle is  ("+centre.getX()+","+centre.getY()+" )");
			
	}

	
	

}
