package com.syntax.class33;
//2.Create a static method that will return a List of Exceptions.

//Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static List<Exception> catchExceptions() {
		int a = 10;
		int b = 0;
		int[] array = { 12, 1, 13 };
		String filePath = "";
		List<Exception> list = new ArrayList<>();

		try {
			System.out.println(a / b);

		} catch (Exception e) {
			list.add(e);
		}

		try {

			System.out.println(array[3]);

		} catch (Exception e) {
			list.add(e);
		}

		try {

			FileInputStream fis = new FileInputStream(filePath);
			//fis.close();
		} catch (Exception e) {
			list.add(e);
		}

		return list;

	}

	public static void main(String[] args) {
		
		List<Exception> list=catchExceptions();
		//System.out.println(list);
		
		for(Exception e:list) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
