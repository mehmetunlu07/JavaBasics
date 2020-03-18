package com.syntax.class09;

public class Hw1 {

	public static void main(String[] args) {
//		Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).

		
		char[] grade= {'A','B','C','D','E','F'};  //1.way
		System.out.println(grade[1]);
		
		char[] grade1=new char[6];  //2.way
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade1[1]);

	}

}
