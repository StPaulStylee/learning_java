package com.training.java.InstanceVariables;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Olives> olives = new ArrayList<>();
		olives.add(new Olives(Olives.KALAMATA, 0x2E0854, 2));
		olives.add(new Olives(Olives.KALAMATA, 0x2E0854, 4));
		olives.add(new Olives(Olives.LIGURIAN, 0x000000, 2));
		olives.add(new Olives(Olives.GREEN, 0x000000, 2));
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println(totalOil);
	}

}
