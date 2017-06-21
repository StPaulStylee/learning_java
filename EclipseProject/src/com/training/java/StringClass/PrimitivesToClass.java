package com.training.java.StringClass;

import java.text.NumberFormat;

public class PrimitivesToClass {

	public static void main(String[] args) {

		int intValue = 42;
		String fromInt = Integer.toBinaryString(intValue);
		System.out.println(fromInt);
		
		boolean boolValue = true;
		String fromBool = Boolean.toString(boolValue);
		System.out.println(fromBool);
		
		//The underscores in this long are simply to improve readability of the value, the compiler sees it as 10,000,000
		long longValue = 10_000_000;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatted = formatter.format(longValue);
		System.out.println(formatted);
	}

}
