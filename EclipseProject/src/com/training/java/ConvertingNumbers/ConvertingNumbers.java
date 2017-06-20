package com.training.java.ConvertingNumbers;

public class ConvertingNumbers {
	
	public static void main (String[] args) {
		// These are copies not references!
		int intValue1 = 56;
		int intValue2 = intValue1;
		System.out.println("The 2nd value is " + intValue2);
		
		long longValue1 = intValue1;
		
		System.out.println("The long value is " + longValue1);

		short shortValue1 = (short) intValue1;
		System.out.println("The short value is " + shortValue1);
		
		//When you narrow a value (go from a larger data type to a smaller) you must use casting syntax
		// Remember, that you can lose data when you cast, so be careful
		int intValue3 = 1024;
		byte byteValue1 = (byte) intValue3; 
		
		System.out.println("The byte value is " + byteValue1);

		double doubleValue = 3.999999d;
		int intValue4 = (int) doubleValue; 
		
		System.out.println("The intValue4 is " + intValue4);


	}
}
