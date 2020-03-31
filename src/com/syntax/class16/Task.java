package com.syntax.class16;
	//1.Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
	//2.Write program to inherit class A that has method printF which is static and call or reuse that method into class B
	//3.Write a Java program called Teacher.  Identify features and behaviour of that Class. 
	// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes 
class A{
	String a="Class A";
	static void printF() {
		System.out.println("Method in Class A");
	}
}
class B extends A{
	String b="Class B";
}

class C extends B{
	String c="Class C";
}
public class Task {

	public static void main(String[] args) {
	  C obj1=new C();
	  System.out.println(obj1.a);
	  System.out.println(obj1.b);
	  System.out.println(obj1.c);
	  System.out.println("-------------------------");
	  B obj2=new B();
	  obj2.printF();
	  A.printF();
	}

}
