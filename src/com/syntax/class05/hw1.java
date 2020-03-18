package com.syntax.class05;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
//		Write a program that will read three inputs of scores (quiz (25%), mid term(35%), and final scores(40%)) 
//		and determine the grade based on the following rules: 
//			if the average score >=90 → grade=A
//			if the average score >= 70 and <90 → grade=B
//			if the average score>=50 and <70 → grade=C
//			if the average score<50 → grade=F

		Scanner input = new Scanner(System.in);
		System.out.println("Input your quiz score");
		int quiz = input.nextInt();
		System.out.println("Input your mid term score");
		int mid = input.nextInt();
		System.out.println("Input your final score");
		int fin = input.nextInt();
		double average = quiz*0.25 + mid*0.35 + fin*0.4;
		String grade;
		if (average <= 100 && average >= 90) {
			grade = "A";
		} else if (average < 90 && average >= 70) {
			grade = "B";
		} else if (average < 70 && average >= 50) {
			grade = "C";
		} else if (average < 50 && average > 0) {
			grade = "F";
		} else {
			grade = "Invalid";
		}
		System.out.println("Your average and grade is= " + average + "  " + grade);
		input.close();

	}

}
