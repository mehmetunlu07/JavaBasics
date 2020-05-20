package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args)  {
		
		multipleSleep();
		
		try {
			read("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("--- END OF THE CODE ----");
	}

	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);// new FileNotFoundException();
	}
	
	public static void multipleSleep() {
		System.out.println("I am in Msleep");
		try {
			System.out.println("I am in Msleep try");
			sleep();
		} catch (InterruptedException e) {
			System.out.println("I am in Msleep catch");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void sleep() throws InterruptedException  {
		System.out.println("I am in sleep");
		Thread.sleep(2000);
	}
	
	
}
