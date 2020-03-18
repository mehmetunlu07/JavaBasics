package com.syntax.class09;

public class NestedLoop6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {      
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
