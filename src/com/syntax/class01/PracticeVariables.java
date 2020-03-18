package com.syntax.class01;

public class PracticeVariables {
	public static void main(String[]args){
	    int myNumber=100;
	    int stepOne,stepTwo,stepThree,stepFour,stepFive,stepSix;
	    
	    stepOne=myNumber*myNumber;
	    stepTwo=stepOne+myNumber;
	    stepThree=stepTwo/myNumber;
	    stepFour=stepThree+17;
	    stepFive=stepFour-myNumber;
	    stepSix=stepFive/6;
	    
	    System.out.println("The magic number is "+stepSix+" !");
	    
	  }
	  

	/*public static void main(String[] args) {
		// Primitive Datatypes
		byte a_1=2;
		byte a11=127;  // 127 is limit for byte
		short a2$=750;
		short a22=32767;  //32767 is limit for short
		int a_3=2143456789;
		long a4=2234567890l;
		float a5=123.45f;
		double a6=1234567.56789888888;
		char a7='%';
		boolean odd=true;
		
		System.out.println(a_1+" byte "+ a11+" short "+a2$);
		System.out.println(a22+" int: "+a_3+" long "+a4);
		System.out.print(a5+" double: "+a6+" char: "+a7+ " boulean: "+ odd);
	}*/

}
