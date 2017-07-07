package com.training.java.InstanceVariables;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Olives> olives = new ArrayList<>();
		Olives olive1 = new Olives();
		olives.add(olive1);
		Olives olive2 = new Olives();
		olive2.setOil(5);
		olives.add(olive2);
		Olives olive3 = new Olives();
		olive3.setOil(2);
		olives.add(olive3);
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println(totalOil);
	}

}
