package com.syntax.class12;

public class TaskType {

	public static void main(String[] args) {
		Task obj = new Task();
		
		int maxNum=obj.max(30, 50);
		System.out.println(maxNum);
		
		obj.oddEven(13);
		obj.palindrome("tenet");
		obj.hello("turkey");
		
		boolean flag=obj.isOdd(16);
		System.out.println(flag);

	}

}
