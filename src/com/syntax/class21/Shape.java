package com.syntax.class21;
//2.Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 

//In circle class create a method to calculate the area of circle. Test your code

public class Shape {
	int radius;

	public Shape(int radius) {
		this.radius = radius;
	}

}

class Circle extends Shape {
	double pi;
	double area;

	Circle(int radius, double pi) {
		super(radius);
		this.pi = pi;
	}

	public double areaCircle() {
		area = pi*radius*radius; // Math.pow(radius, 2);  // to get square 
		return area;
	}
}