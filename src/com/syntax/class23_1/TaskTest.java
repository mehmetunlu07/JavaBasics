package com.syntax.class23_1;

public class TaskTest {

	public static void main(String[] args) {
		Task apple=new Apple("Apple");
		//c.price();
		Task lenovo=new Lenovo("Lenovo");
		Task hp=new HP("HP");
		Task dell=new Dell("Dell");
		
		Task[] computer= {apple,lenovo,hp,dell};
		
		for(int i=0;i<computer.length;i++) {
			computer[i].price();
			computer[i].performance();
			System.out.println("------------------");
			
		}
		
		//Apple acomp=(Apple)new Computer("Computer"); CE//Downcasting

	}

}
