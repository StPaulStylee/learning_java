package com.training.java.InstanceVariables;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olives> olives) {
		for (Olives olive : olives) {
			System.out.println(olive.name);
		}
		return 0;
	}
	
}
