package com.training.java.libraries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class NewIO {
	
	public static void main(String[] args) {
	
	Path sourceFile = Paths.get("E:\\Jeff\\java\\Lynda\\essential_training\\EclipseProject\\src\\com\\training\\java\\libraries\\files\\", "fileread.txt");
	Path targetFile = Paths.get("E:\\Jeff\\java\\Lynda\\essential_training\\EclipseProject\\src\\com\\training\\java\\libraries\\files\\", "target.txt");
	
	try {
		Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File read and created!");
	}	catch(IOException e) {
		e.printStackTrace();
		}
	}
}

