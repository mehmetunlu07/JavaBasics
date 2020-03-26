package com.syntax.class14;

public class Task1 {
	//1.Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class.
	
	protected int method(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		Task1 obj=new Task1();
		int[] arr= {2,4,6,4,1,3};
		
		System.out.println("Sum of array is "+obj.method(arr));

				
	}

}
