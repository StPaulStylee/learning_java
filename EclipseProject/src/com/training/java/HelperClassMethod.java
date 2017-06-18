package com.training.java;

public class HelperClassMethod {
	
	public static void declarePrimitives() {
	double doubleValue = 1.476d; // the "d" declare to the compiler that this is a double, not strictly necessary
	Double doubleObj = new Double(doubleValue); // Here, an object is created using the Double helper class. The obj holds a double value
	byte byteValue = doubleObj.byteValue(); // by making the double value primitive into an object using the helper class, you can now run a bunch of methods on it
	int intValue = doubleObj.intValue();
	float floatValue = doubleObj.floatValue();
	String stringValue = doubleObj.toString();
	
	System.out.println(doubleValue);
	System.out.println(doubleObj.toString());
	System.out.println(byteValue);
	System.out.println(intValue);
	System.out.println(floatValue);
	System.out.println(stringValue);
	}
}