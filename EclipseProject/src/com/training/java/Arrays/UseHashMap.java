package com.training.java.Arrays;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

	public static void main(String[] args) {
		//Each item in a map is a key value pair... they can have any data type
		Map<String, String> map = new HashMap<>();
		map.put("Minnesota", "Saint Paul");
		map.put("Wisconsin", "Madison");
		map.put("Iowa", "Des Moines");
		System.out.println(map);
		
		map.put("North Dakota", "Shit");
		System.out.println(map);
		
		String capital = map.get("Minnesota");
		System.out.println(capital);
		
		map.remove("North Dakota");
		System.out.println(map);
		
	}

}
