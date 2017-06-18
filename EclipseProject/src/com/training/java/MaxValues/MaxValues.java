package com.training.java.MaxValues;

public class MaxValues {
// The point of this lesson is to emphasize the fact that if a primitive data type exceeds it's max value, it wraps back around to it's
// lowest possible value
	public static void main() {
		byte b = 127;
		System.out.println("Byte " + b);
		if (b < Byte.MAX_VALUE){
		b++;
		}
		System.out.println("Byte " + b);
	}
}
