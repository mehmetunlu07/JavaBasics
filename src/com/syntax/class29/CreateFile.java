package com.syntax.class29;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Users\\Mike\\eclipse-workspace\\JavaBasics\\filename.txt"); //path yazilmazsa project folderi altina yazar
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				
				System.out.println("File name: " + myObj.getName());
			    System.out.println("Absolute path: " + myObj.getAbsolutePath());
			    System.out.println("Writeable: " + myObj.canWrite());
			    System.out.println("Readable " + myObj.canRead());
			    System.out.println("File size in bytes " + myObj.length());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}