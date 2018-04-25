package com.geometry.square;

import com.geometry.shape.Shape;

public class Square implements Shape {
	
	private double length;
	
	public Square(double length){
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double computeArea() {
		double area = Math.pow(length, 2);
		return area;
	}

	public double computePerimeter() {
		double perimeter = length * 4;		
		return perimeter;
	}
}
