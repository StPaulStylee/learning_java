package com.training.java.StringClass;

import java.util.Scanner;

public class StringBuilderClass {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + ", " + str2 + "!";
		
		// Using the StringBuilder class allows us to do the same thing we did above, but this time only create one object to
		//do so. Also, the .append method is referencing the sb instantiation, therefore, we can chain our calls together
		// as we did below. You could also just do sb.append(string) if so desired.
		StringBuilder sb = new StringBuilder("Hello")
			.append(", ")
			.append("World")
			.append("!");
		System.out.println(sb);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value: ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		sb.delete(0, sb.length());
		for (int i = 0; i < 3; i++) {
			input = scanner.nextLine();
			sb.append(input + "\n");
		}
		System.out.println(sb);
	}

}
