package com.training.java.Math;


public class Main {

	public static void main(String[] args) {
		
		int intValue1 = 56;
		int intValue2 = 42;
		
		int result1 = intValue1 + intValue2;
		
		System.out.println("Addition: " + result1);

		
		int result2 = intValue1 - intValue2;
		System.out.println("Subtraction: " + result2);

		
		int result3 = intValue1 * intValue2;	
		System.out.println("Multiplication: " + result3);

		// Here we use casting to ensure we return the correct data type to result4. Without casting,
		// the value would round down to the nearest integer.
		double result4 = (double) intValue1 / intValue2;
		System.out.println("Division: " + result4);

		double result5 = (double) intValue1 % intValue2;
		System.out.println("Remainder: " + result5);
		
		//The math class is part of java.lang, so no need to import. Also, all methods on the math class are static!
		double doubleValue = -3.99999;
		long rounded = Math.round(doubleValue);	
		System.out.println("Rounded: " + rounded);
		
		double absValue = Math.abs(doubleValue);
		System.out.println("Absolute: " + absValue);

		
		
	}

}
