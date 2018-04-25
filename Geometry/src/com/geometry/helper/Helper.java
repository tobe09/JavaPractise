package com.geometry.helper;

import java.util.Scanner;

public class Helper {
	
	public static double validateDouble(String valueStr, String prompt, Scanner sc) {
		while (!tryParse(valueStr)){
			System.out.print(prompt);
			valueStr = sc.next();			
		}
		
		return getDouble(valueStr);
	}
	
	static boolean tryParse(String valueStr){
		boolean status = ((Boolean)checkString(valueStr)[0]).booleanValue();
		return status;
	}
	
	static double getDouble(String valueStr){
		double valueDouble = ((Double)checkString(valueStr)[1]).doubleValue();
		return valueDouble;
	}
	
	static Object[] checkString(String valueStr){
		try{
			double valueDouble = Double.parseDouble(valueStr);
			return new Object[]{new Boolean(true), new Double(valueDouble)};
		}
		catch(NumberFormatException ex){
			return new Object[]{new Boolean(false), new Double(0)};
		}
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    
	    return (double) tmp / factor;
	}
	
}
