package com.geometry.app;

import java.util.Scanner;
import com.geometry.circle.Circle;
import com.geometry.helper.Helper;
import com.geometry.shape.Shape;
import com.geometry.square.Square;
import com.geometry.trapezium.Trapezium;
import com.geometry.triangle.Triangle;
import com.geometry.rectangle.Rectangle;

public class App {
	
	public static void main(String[] args){
		System.out.println("This is an application to calculate area and "+
				"perimeter of predefined shapes\r\n");
		
		System.out.println("Enter '1' for Square, \r\n" +
				"'2' for Rectangle \r\n" +
				"'3' for Triangle \r\n" +
				"'4' for Circle and \r\n" +
				"'5' for Trapezium\r\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter shape code: ");
		String shapeCodeStr = sc.next();
		
		int shapeCode = 0;		//default initial value
		
		while(shapeCode < 1 || shapeCode > 5){
			double shapeCodeDouble = Helper.validateDouble(shapeCodeStr, 
				"Please enter a valid shape code: ", sc);
			shapeCode = (int)shapeCodeDouble;		
			shapeCodeStr = "arbitrary value";	//to ensure loop continuation
		}

		System.out.println();
		
		Shape shape;
		
		switch (shapeCode) {		
		case 1:
			shape = createSquare(sc);
			break;
			
		case 2:
			shape = createRectangle(sc);
			break;
			
		case 3:
			shape = createTriangle(sc);
			break;
			
		case 4:
			shape = createCircle(sc);
			break;
			
		case 5:
			shape = createTrapezium(sc);
			break;
			
		default:
			shape = createSquare(sc);
			break;
		}
		
		String[] shapeCodeArr={"Square", "Rectangle", "Triangle", "Circle", "Trapezium"};

		String shapeStr = shapeCodeArr[shapeCode - 1];
		
		double area = shape.computeArea();
		area = Helper.round(area, 2);
		double perimeter = shape.computePerimeter();
		perimeter = Helper.round(perimeter, 2);
		
		System.out.println();
		
		System.out.println("The area of specified " + shapeStr + " is: " + area);
		System.out.println("The perimeter of specified " + shapeStr + " is: " + perimeter);
	}
	
	static Shape createSquare(Scanner sc){
		System.out.println("Shape chosen: Square");
		
		System.out.print("Enter length: ");
		String lengthStr = sc.next();
		double length = Helper.validateDouble(lengthStr, 
				"Please enter a valid length: ", sc);
		
		return new Square(length);
	}
	
	static Shape createRectangle(Scanner sc){
		System.out.println("Shape chosen: Rectangle");
		
		System.out.print("Enter length: ");
		String lengthStr = sc.next();
		double length = Helper.validateDouble(lengthStr, 
				"Please enter a valid length: ", sc);
		
		System.out.print("Enter breadth: ");
		String breadthStr = sc.next();
		double breadth = Helper.validateDouble(breadthStr, 
				"Please enter a valid bredth: ", sc);
		
		return new Rectangle(length, breadth);
	}
	
	static Shape createTriangle(Scanner sc){
		System.out.println("Shape chosen: Traingle");
		
		System.out.print("Enter first side: ");
		String sideOneStr = sc.next();
		double sideOne = Helper.validateDouble(sideOneStr, 
				"Please enter a valid first side: ", sc);	
		
		System.out.print("Enter second side: ");
		String sideTwoStr = sc.next();
		double sideTwo = Helper.validateDouble(sideTwoStr, 
				"Please enter a valid second side: ", sc);	
		
		System.out.print("Enter third side: ");
		String sideThreeStr = sc.next();
		double sideThree = Helper.validateDouble(sideThreeStr, 
				"Please enter a valid third side: ", sc);	
		
		return new Triangle(sideOne, sideTwo, sideThree);
	}
	
	static Shape createCircle(Scanner sc){
		System.out.println("Shape chosen: Circle");
		
		System.out.print("Enter radius: ");
		String radiusStr = sc.next();
		double radius = Helper.validateDouble(radiusStr, 
				"Please enter a valid radius: ", sc);	
		
		return new Circle(radius);
	}
	
	static Shape createTrapezium(Scanner sc){
		System.out.println("Shape chosen: Trapezium");
		
		System.out.print("Enter short side: ");
		String shortSideStr = sc.next();
		double shortSide = Helper.validateDouble(shortSideStr, 
				"Please enter a valid short side: ", sc);	
		
		System.out.print("Enter long side: ");
		String longSideStr = sc.next();
		double longSide = Helper.validateDouble(longSideStr, 
				"Please enter a valid long side: ", sc);	
		
		System.out.print("Enter height: ");
		String heightStr = sc.next();
		double height = Helper.validateDouble(heightStr, 
				"Please enter a valid height: 3", sc);
		
		return new Trapezium(shortSide, longSide, height);
	}
}
