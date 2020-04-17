package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		RegistrationClass rc=new RegistrationClass();
		rc.setEmail("john@yahoo.com");
		System.out.println(rc.getEmail());
		
		rc.setUserName("Joanny123");
		System.out.println(rc.getUserName());
		
		rc.setPassword("Samsun12345");
		System.out.println(rc.getPassword());
	}

}
