package com.algorithmtest.algorithms;

import java.util.Scanner;
import  com.algorithmtest.helper.Helper;

public class Algorithms {
	
	public static void main(String[] args){
		System.out.println("Generate even numbers within a range\r\n");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start number: ");
		String startNoStr = sc.next();		
		int startNo = Helper.validateInt(startNoStr, 
			"Please enter a valid start integer", sc);
		System.out.println();

		System.out.print("Enter end number: ");
		String endNoStr = sc.next();		
		int endNo = Helper.validateInt(endNoStr, 
			"Please enter a valid end integer", sc);
		System.out.println();	
		
		int[] numbers = getEven(startNo, endNo);
		
		System.out.println("The number(s) is/are: ");
		printArray(numbers);

		System.out.println("\r\n\r\n");

		
		System.out.println("Reverse a given string\r\n");

		System.out.print("Enter your string: ");
		String value = sc.next();
		String valueReversed = reverseString(value);
		System.out.print("The reversed value is: " + valueReversed);		
	}
	
	public static int[] getEven(int min, int max){
		int start = min % 2 == 0 ? min : min + 1;
		
		double countDouble = (double)(max - min) / 2;
		int count = (int)Math.ceil(countDouble);
		if(min % 2 == 0 && max % 2 == 0) count++;
		
		if(count < 1) return new int[]{};
		
		int[] valuesArr = new int[count];
		
		for(int i = 0; i < count; i++){
			valuesArr[i] = start;
			start += 2;
		}
		
		return valuesArr;
	}
	
	public static void printArray(int[] arr){
		if(arr.length < 1) System.out.println("Incorrect range");
			
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static String reverseString(String str){
		String strReversed = "";
		
		for(int i = str.length() - 1; i >= 0; i--){
			strReversed += str.charAt(i);
		}
		
		return strReversed;
	}
	
}
