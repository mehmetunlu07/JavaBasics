package com.syntax.class26_1;

public class Repl165Test extends Repl165{
	  void m1(){
	      System.out.println("m1 without parameters");
	  }
	  void m1(int a){
	      System.out.println("m1 method with parameter");
	    
	  }
	  
	  public static void main(String[]args){
		Repl165 m=new Repl165Test();
	    m.m1();
	    m.m1(5);
	  }
	}