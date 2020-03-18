package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
//		Create a boolean variable workDay and assign true create int variable day and assign it to 1
//		As long as it is workDay print “I need a day off” and increase day.
//		Once day is 6 print “I do not need a day off any more”

		boolean workDay = true;
		int day = 1;
		while (workDay && day < 6) {
			System.out.println("day: "+day+" I need a day off");
			day++;
		}
		System.out.println("I do not need a day off any  more");

	}

}
