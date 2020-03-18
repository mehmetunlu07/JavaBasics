package com.syntax.class09;

public class NestedLoop4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {      // print 5 rows of 54321
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("*********** 2.pattern****************");

		for (int i = 5; i >= 1; i--) { //  print   55555 the 44444 ---> 11111
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
