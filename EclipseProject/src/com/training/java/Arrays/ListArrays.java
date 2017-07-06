package com.training.java.Arrays;

import java.util.List;
import java.util.ArrayList;

public class ListArrays {

	public static void main(String[] args) {
		// When declaring primitive types inside the diamond operator, you must use the helper class - int == Integer, etc
		List<String> list = new ArrayList<>(); // in the params, you can declare the amount of elements you will need to have more efficient memory allocation
		list.add("Minnesota");
		list.add("Wisconsin");
		list.add("Iowa");
				
		list.add("North Dakota");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		String state = list.get(1);
		System.out.println("The second state is " + state);
		
		int post = list.indexOf("North Dakota");
		System.out.println(post);
		
		
		
		
	}

}
