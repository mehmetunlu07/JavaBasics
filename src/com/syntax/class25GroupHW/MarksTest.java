package com.syntax.class25GroupHW;

public class MarksTest {

	public static void main(String[] args) {
		Marks studentA=new A(70,80,90);
		double average=studentA.getPercentage();
		System.out.println("Average of student A is "+average);
		
		Marks studentB=new B(70,80,90,100);
		average=studentB.getPercentage();
		System.out.println("Average of student B is "+average);

	}

}
