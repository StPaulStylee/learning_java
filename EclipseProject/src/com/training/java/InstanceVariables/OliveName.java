package com.training.java.InstanceVariables;

public enum OliveName {
	KALAMATA("Kalamata"), LIGURIAN("Ligurian"), GREEN("Green"), BLACK("Black");
	
	private String name;
	
	OliveName(String name) {
		this.name;
	}
	 @Override
	public String toString() {
		return name;
	}
}
