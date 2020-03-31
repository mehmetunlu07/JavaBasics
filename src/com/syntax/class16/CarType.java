package com.syntax.class16;

public class CarType {

	public static void main(String[] args) {
		 Car obj=new Car("Toyota","Prius",4,120,30000.0);
		  obj.display();
		  Car obj1=new Car("Toyota","Prius",120,30000.0);
		  obj1.display();
		  Car obj2=new Car(4,120,30000.0);
		  obj2.display();
		  Car obj3=new Car("Toyota","Prius",4);
		  obj3.display();
		  

		}
}