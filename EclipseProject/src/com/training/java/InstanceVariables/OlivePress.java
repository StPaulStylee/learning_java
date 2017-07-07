package com.training.java.InstanceVariables;

import java.util.List;

public class OlivePress {

	int totalOil = 0;
	public int getOil(List<Olives> olives) {
		for (Olives olive : olives) {
			System.out.println(olive.name);
			totalOil += olive.crush();
		}
		return totalOil;
	}
	
}
