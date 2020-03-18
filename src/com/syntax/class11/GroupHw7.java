package com.syntax.class11;

public class GroupHw7 {

	public static void main(String[] args) {
//		7.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		
		int temp=0;
		int[] num= {3,5,18,1,35,2,99,44,81,756,96,100,64};
		
		for(int i=0;i<num.length;i++) {
			 for(int j=i+1;j<num.length;j++) {
				 if(num[i]>num[j]) {
					 temp=num[i];
					 num[i]=num[j];
					 num[j]=temp;
				 }
			 }
		}
		
		System.out.println("Minimum number: "+num[0]);
		System.out.println("Maximum number: "+num[num.length-1]);
		System.out.println("Second largest number: "+num[num.length-2]);
	}

}
