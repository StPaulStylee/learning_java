package com.training.java.InstanceVariables;

public class Olives {
	

	
	// We make the 3 instance variables private so that they can only be accessed by the getters and setters of it's class instances
	private OliveName name = OliveName.KALAMATA;
	private long color = 0x2E0854;
	private int oil = 3;
	
	public Olives(){}
	
	public Olives(OliveName name, long color, int oil) {
		this.name = name;
		this.color = color;
		this.oil = oil;
	}
	public OliveName getName() {
		return name;
	}
	public void setName(OliveName name) {
		this.name = name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long color) {
		this.color = color;
	}
	public int crush() {
		System.out.println("Ouch!");
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	
	
	
	
}
