package com.training.java.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		
		String[][] states = new String[3][2];
		states[0][0] = "Minnesota";
		states[0][1] = "Saint Paul";
		states[1][0] = "Wisconsin";
		states[1][1] = "Madison";
		states[2][0] = "Iowa";
		states[2][1] = "Des Moines";
		
		for (int i = 0; i< states.length; i++)
			System.out.println(states[i][1] + ", " + states[i][0]);
			
	}

}
