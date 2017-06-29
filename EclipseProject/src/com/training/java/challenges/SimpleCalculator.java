package com.training.java.challenges;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		String firstValue, secondValue;
		System.out.println("What is the first value you'd like to use for our addition problem?");
		firstValue = scanner.nextLine();
		System.out.println("And what will we use as the 2nd number used to find the sum?");
		secondValue = scanner.nextLine();		
		
		Number f1 = NumberFormat.getInstance().parse(firstValue);
		Number f2 = NumberFormat.getInstance().parse(secondValue);
		double d1 = f1.doubleValue();
		double d2 = f2.doubleValue();

		System.out.println("The sum of the values is: " + (d1 + d2));
		
		// A quicker and simpler way to solve this problem is to use two string at your initial primitives, then use the 
		// Double helper class to parse the strings into doubles, then add them together.
	}

}
