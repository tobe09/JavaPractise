package com.geometry.rectangle;

import com.geometry.shape.Shape;

public class Rectangle implements Shape {
	
	private double length;
	private double breadth; 
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double computeArea() {
		double area = length * breadth;
		return area;
	}

	public double computePerimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

}
