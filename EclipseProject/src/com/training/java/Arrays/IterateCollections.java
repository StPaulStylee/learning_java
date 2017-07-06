package com.training.java.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterateCollections {

	public static void main(String[] args) {
		
		System.out.println("Ordered Data");
		List<String> list = new ArrayList<>();
		list.add("Minnesota");
		list.add("Wisconsin");
		list.add("Iowa");
				
		System.out.println("toString() output");
		System.out.println(list);
		System.out.println("");
		
		System.out.println("ArrayList iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		
		System.out.println("ArrayList ForEach");
		for (String value : list) {
			System.out.println(value);
		}
		
		System.out.println("Java 8 method reference");
		list.forEach(System.out::println);
		
		System.out.println("Unordered Data: ");
		Map<String, String> map = new HashMap<>();
		map.put("Minnesota", "Saint Paul");
		map.put("Wisconsin", "Madison");
		map.put("Virginia", "Richmond");
		System.out.println(map);
		System.out.println("");
		
		System.out.println("HashMap Iterator: ");
		Set<String> keys = map.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while (iterator1.hasNext()){
			String key = iterator1.next();
			System.out.println(key + map.get(key)); //map.get(key) gets the value that the key represents
		}
		System.out.println("");
		
		System.out.println("HashMap ForEach");
		for (String key : keys) {
			System.out.println(key + map.get(key));
		}
		System.out.println("");
	}

}
