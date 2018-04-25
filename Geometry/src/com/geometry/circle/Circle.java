package com.geometry.circle;

import com.geometry.shape.Shape;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public double computePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

}
