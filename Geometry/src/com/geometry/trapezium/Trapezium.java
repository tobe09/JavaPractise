package com.geometry.trapezium;

import com.geometry.shape.Shape;

public class Trapezium implements Shape {
	
	private double shortSide;
	private double longSide;
	private double height;
	
	public Trapezium(double shortSide, double londgSide, double height) {
		this.shortSide = shortSide;
		this.longSide = londgSide;
		this.height = height;
	}
	
	public double getShortSide() {
		return shortSide;
	}

	public void setShortBase(double shortSide) {
		this.shortSide = shortSide;
	}

	public double getLongSide() {
		return longSide;
	}

	public void setLongBase(double longSide) {
		this.longSide = longSide;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double computeArea() {
		double area = (shortSide + longSide) * height / 2;
		return area;
	}

	public double computePerimeter() {
		double slantHeightSquare = (Math.pow((longSide - shortSide), 2) + 
				Math.pow(height, 2));
		double slantHeight = Math.sqrt(slantHeightSquare);
		double perimeter = shortSide + longSide + height + slantHeight;
		
		return perimeter;
	}

}
