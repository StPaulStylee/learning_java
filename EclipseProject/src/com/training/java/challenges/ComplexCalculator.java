package com.training.java.challenges;

import java.util.Scanner;

public class ComplexCalculator {
	static String input1;
	static String input2;
	static String operator;
	static Double value1;
	static Double value2;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		setValues();
		setOperator();
		getSolution();
		

	}
	
	public static void setValues() {
		System.out.println("Enter the 1st value: ");
		input1 = sc.nextLine();
		value1 = Double.parseDouble(input1);
		System.out.println("Enter the 2nd value: ");
		input2 = sc.nextLine();
		value2 = Double.parseDouble(input2);
	}
	
	public static void setOperator() {
		System.out.println("Choose your operator: + , - , * , / : ");
		operator = sc.nextLine();
	}
	
	public static void getSolution() {
		switch(operator) {
		case "+":
			System.out.println("The sum of the value is: " + (value1 + value2));
			break;
		case "-":
			System.out.println("The subtracted values equal: " + (value1 - value2));
			break;
		case "*":
			System.out.println("The product of the values is: " + (value1 * value2));
			break;
		case "/":
			System.out.println("The divided values equal: " + (value1 / value2));
			break;
		default:
			System.out.println("You did not choose a valid operand. Please start over.");
		}
	}

}
