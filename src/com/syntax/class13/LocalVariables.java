package com.syntax.class13;

public class LocalVariables {
	void nameInside() {

		String name = "John";  // local variable that visible only within method it was declared, color is brown
		//System.out.println(obj);
		
	}

	void anotherName() {

		String name = "Jane";   //local variable
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		//System.out.println(name);  //CE: name won;t be visible to another method
		// since its scope only within nameInside method

		LocalVariables obj = new LocalVariables();
		obj.nameInside();
		obj.anotherName();
		//String a=obj.name; //CE local variable

		boolean flag = true;
		if (flag) {
			String answer = "Yes";
		}

		//System.out.println(answer);  //CE: scope of variable answer is not visible
		// outside of if block
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		String name = "Gulbahar";
		System.out.println(name);
	}
}