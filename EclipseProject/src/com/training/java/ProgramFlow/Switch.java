package com.training.java.ProgramFlow;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		String input = sc.nextLine();
		int monthNumber = Integer.parseInt(input);
		
		switch(monthNumber) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is Feb");
			break;
		case 3:
			System.out.println("The month is Mar");
			break;	
		default:
			System.out.println("You chose another month4");
			
			
		}
		
	}

}
