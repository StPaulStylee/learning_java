package com.training.java.libraries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		String sourceFile = "E:\\Jeff\\java\\Lynda\\essential_training\\EclipseProject\\src\\com\\training\\java\\libraries\\files\\fileread.txt";
		String targetFile = "E:\\Jeff\\java\\Lynda\\essential_training\\EclipseProject\\src\\com\\training\\java\\libraries\\files\\target.txt";
		
		try (FileReader fReader = new FileReader(sourceFile); //instanitating these objects in side the try params automatically closes them when done.
			 BufferedReader bReader = new BufferedReader(fReader);
			 FileWriter writer = new FileWriter(targetFile)){
			while (true) {
				String line = bReader.readLine();
				if (line == null) {
					break;
				}
				else {
					writer.write(line + "\n");
				}
			}
			System.out.println("File Copied!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
