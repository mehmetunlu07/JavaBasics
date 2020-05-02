package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserReading {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\Mike\\eclipse-workspace\\JavaBasics\\configs\\Browser.properties";
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		System.out.println(username+" --- "+password);
		System.out.println("---------- Writing to the file --------------");
		
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additonal key");

	}

}
