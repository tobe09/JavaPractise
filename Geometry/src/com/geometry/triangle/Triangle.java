package com.geometry.triangle;

import com.geometry.shape.Shape;

public class Triangle implements Shape {
	
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	public Triangle(double sideOne, double sideTwo, double sideThree){
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	public double computeArea() {
		double p = computePerimeter() / 2;
		//using heron's formula
		double areaSquare = p * (p - sideOne) * (p - sideTwo) * (p - sideThree);
		double area = Math.sqrt(areaSquare);
		
		return area;
	}

	public double computePerimeter() {
		double perimeter = sideOne + sideTwo + sideThree;
		return perimeter;
	}

}
