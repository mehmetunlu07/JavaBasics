package com.syntax.class25GroupHW;
//Hw1.Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
//    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
//    Test your code.
public interface Shape {
	public static final double pi=3.14;
	void calculateArea(double r);    // r=radius=yaricap
	void calculatePerimeter(double x);

}
class Circle implements Shape{

	@Override
	public void calculateArea(double r) {
		System.out.println("Circle area is "+pi*r*r);
		
	}

	@Override
	public void calculatePerimeter(double r) {
		System.out.println("Circle perimeter is "+2*pi*r);
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea(double x) {
		System.out.println("Square area is "+x*x);
		
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("Square perimeter is "+4*x);
		
	}
	
}
