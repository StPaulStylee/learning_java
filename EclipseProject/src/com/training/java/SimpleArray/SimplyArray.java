package com.training.java.SimpleArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimplyArray {

	public static void main(String[] args) {

		System.out.println("Array of primitives: ");
		int[] values = {15, 6, 9}; // once they have been sized, the can't be changed
		Arrays.sort(values);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println("Array of strings: ");
		String[] strings = {"Go", "Dog", "Go"};
		Arrays.sort(strings);
		for (String string : strings) {
			System.out.println(string);
		}
		
		
		System.out.println("Setting an initial size: ");
		int[] sized = new int[10];
		for (int value : sized) { // DONT FORGET THAT YOU HAVE TO DECLARE TYPE IN A FOR/EACH LOOP
			
		}
		
		
		System.out.println("Copying and array: ");

		
	}

}
