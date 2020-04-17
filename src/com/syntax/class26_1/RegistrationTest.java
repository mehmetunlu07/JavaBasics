package com.syntax.class26_1;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration r=new Registration();
				
		r.setEmail("syntax@yahoo.com");
		System.out.println(r.getEmail());
		r.setUserName("Johnny345");
		System.out.println(r.getUserName());
		r.setPassword("12344567");
		System.out.println(r.getPassword());

	}

}
