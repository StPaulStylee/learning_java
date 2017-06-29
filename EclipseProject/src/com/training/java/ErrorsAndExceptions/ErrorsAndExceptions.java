package com.training.java.ErrorsAndExceptions;

public class ErrorsAndExceptions {

	public static void main(String[] args) {

		String s = null;
		
		System.out.println(s);
	
		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();
		char lastChar = chars[chars.length - 1];
		System.out.println(lastChar);
	}

}
