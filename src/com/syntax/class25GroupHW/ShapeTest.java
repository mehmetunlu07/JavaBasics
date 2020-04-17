package com.syntax.class25GroupHW;

public class ShapeTest {

	public static void main(String[] args) {
		Shape c=new Circle();
		c.calculateArea(10);
		c.calculatePerimeter(10);
		
		System.out.println();
		Shape s=new Square();
		s.calculateArea(10);
		s.calculatePerimeter(10);

	}

}
