package com.syntax.class07;

public class Task2 {
	public static void main(String[] args) {
		boolean workDay = true;
		int variableDay = 1;
		while (workDay) {
			while (variableDay < 6) {
				System.out.println("I need a day off");
				variableDay++;
			}
			System.out.println("I do not need a day off");
			workDay = false;
		}

	}
}
