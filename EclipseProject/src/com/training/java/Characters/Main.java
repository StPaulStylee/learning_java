package com.training.java.Characters;

public class Main {

	public static void main(String[] args) {
		
		char c1 = '1';
		char c2 = '2';
		char c3 = '3';
		System.out.println("Char1: " + c1);
		
		char dollarSign = '\u0024';
		System.out.println("Currency: " + dollarSign);

		char a1 = 'a';
		char a2 = 'b';
		char a3 = 'c';
		System.out.print(Character.toUpperCase(a1));
		System.out.print(Character.toUpperCase(a2));
		System.out.println(Character.toUpperCase(a3));

	}

}
