package com.syntax.class12;

public class Task1 {

	char getGrade(int a) {
		char grade;

		if (a >= 90) {
			grade = 'A';
		} else if (a >= 80 && a < 90) {
			grade = 'B';
		} else if (a >= 70 && a < 80) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		char grade = obj.getGrade(95);
		System.out.println(grade);
		System.out.println(obj.getGrade(87));

		if (grade == 'A' || grade == 'B') {
			System.out.println("Good job");
		} else {
			System.out.println("Please study more");
		}

	}

}
