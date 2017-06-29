package com.training.java.ErrorsAndExceptions;

public class ErrorsAndExceptions {

	public static void main(String[] args) {

		String s = null;
		
		System.out.println(s);
		String welcome = "Welcome!";
		char lastChar;
		char[] chars = welcome.toCharArray();

		
		try {
			lastChar = chars[chars.length - 1];
			System.out.println(lastChar);
			
			String sub = welcome.substring(10);
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Ya gone fucked up!");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Why you gotta try and make a substring all incorrectly!?");
		}
		
	}

}
