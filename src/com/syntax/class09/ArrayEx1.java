package com.syntax.class09;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		num[1]=80;
		for(int i=0;i<=num.length-1;i++) {
		System.out.println(num[i]);
		}
		System.out.println(num.length);
		System.out.println("*********************");
		
		for(int i:num) {
			System.out.println(i);
		}
	}

}
