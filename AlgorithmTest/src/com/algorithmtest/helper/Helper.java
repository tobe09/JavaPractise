package com.algorithmtest.helper;

import java.util.Scanner;

public class Helper {
	
	public static int validateInt(String valueStr, String prompt, Scanner sc) {
		while (!tryParse(valueStr)){
			System.out.print(prompt);
			valueStr = sc.next();			
		}
		
		return getInt(valueStr);
	}
	
	static boolean tryParse(String valueStr){
		boolean status = ((Boolean)checkString(valueStr)[0]).booleanValue();
		return status;
	}
	
	static int getInt(String valueStr){
		int valueInt = ((Integer)checkString(valueStr)[1]).intValue();
		return valueInt;
	}
	
	static Object[] checkString(String valueStr){
		try{
			int valueInt = Integer.parseInt(valueStr);
			return new Object[]{new Boolean(true), new Integer(valueInt)};
		}
		catch(NumberFormatException ex){
			return new Object[]{new Boolean(false), new Integer(0)};
		}
	}
	
}
