package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		String filePath="C:\\Users\\Mike\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String country=prop.getProperty("country");
		System.out.println(country);
		
		prop.setProperty("phoneNumber7","6790");
		System.out.println(prop.put("phone3", "98766"));
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additonal key");
		
	
		

	}
}
