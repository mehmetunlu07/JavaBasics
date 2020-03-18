package com.syntax.class02;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 6;
		if (month == 1) {
			System.out.println("It is January");
		} else if (month == 2) {
			System.out.println("It is Feb");
		} else if (month == 3) {
			System.out.println("It is March");
		} else if (month == 4) {
			System.out.println("It is April");
		} else if (month > 4 && month <= 12) {
			System.out.println("It is later than April");
		} else
			System.out.println("Invalid month");
	}

}
