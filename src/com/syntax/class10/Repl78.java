package com.syntax.class10;

import java.util.Scanner;

public class Repl78 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  int nums[]=new int[5];
		  
		  for(int i=0;i<nums.length;i++){
		     nums[i]=scan.nextInt();
		  }
		  
		  for(int i=0; i<nums.length;i++){
		      System.out.println(nums[i]*10);
		  }

	}

}
