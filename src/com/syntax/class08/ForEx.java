package com.syntax.class08;

public class ForEx {

	public static void main(String[] args) {
		// write a program to calculate sum of odds and sum of even numbers 1-99
		int sumOdd=0;
		int sumEven=0;
		int sumTotal;
		
		for(int i=1;i<=99;i+=2) {
			sumOdd=sumOdd+i;
		}
       System.out.println(sumOdd);
       
       for(int i=2;i<=99;i+=2) {
			sumEven=sumEven+i;
		}
      System.out.println(sumEven);
      
      sumTotal=sumOdd+sumEven;
      System.out.println("Total sum:"+sumTotal);
      
	}

}
