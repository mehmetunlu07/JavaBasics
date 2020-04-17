package com.syntax.class26;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("John");
		emp.setAge(21);
		emp.setSalary(4000);
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
	}
}
