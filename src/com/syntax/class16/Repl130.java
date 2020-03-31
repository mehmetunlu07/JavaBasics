package com.syntax.class16;

public class Repl130 {
	private void method(){
		    System.out.println("This is Private Method");
		  }

	void method1(){
		    System.out.println("This is Default Method");
		  }

	protected void method2(){
		    System.out.println("This is Protected Method");
		  }

	public void method3(){
		    System.out.println("This is Public Method");
		  }

	public static void main(String[] args) {

		Repl130 obj = new Repl130();
		obj.method();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}