package com.training.java.ErrorsAndExceptions;

public class ErrorsAndExceptions {

	public static void main(String[] args) {

		String s = null;
		
		System.out.println(s);
		String welcome = "Welcome!";
		char lastChar;
		char[] chars = welcome.toCharArray();

		
		try {
			lastChar = chars[chars.length];
			System.out.println(lastChar);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}
