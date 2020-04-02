package com.syntax.class20;
//Create relation between Main class and Method by making Main class as a subclass of Method Class
//Use Array:
//int[][] a = {    { 1, 2, 3 }, 
//                 { 4, 5, 6 }, 
//                 { 7, 8, 9 } };    and execute sum2D method

public class MethodType extends Method {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int total=MethodType.sum2D(a);
		System.out.println("Sum of 2D array is "+total);

	}

}
