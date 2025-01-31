package com.lpu;

import org.springframework.stereotype.Component;

@Component
public class Circle {
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
		area();
	}
	
	public void area() {
		double result = 3.14 * this.radius * this.radius;
		System.out.println("Area of Circle:" + result);
		
	}
	

}
