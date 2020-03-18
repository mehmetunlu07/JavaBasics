package com.syntax.class09;

public class NestedLoop3 {

	public static void main(String[] args) {    // print 10*10 star
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Second pattern");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
