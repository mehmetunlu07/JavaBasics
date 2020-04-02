package com.syntax.class21;
//1.Write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
// Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. 
// Print users name, mobile number and address in userDetails method. Test your code.

public class User {
	String name;
	String mobileNum;
	
	public User(String name, String mobileNum) {
		this.name=name;
		this.mobileNum=mobileNum;
	}
	void userDisplay() {
		System.out.println("This is parent class method");
	}
}	
 class UserInfo extends User{
	String userAddress;
	
	public UserInfo(String name, String mobileNum,String userAddress) {
		super(name,mobileNum);
		this.userAddress=userAddress;
	}
	
	void userDetails() {
		System.out.println(name+" "+mobileNum+" "+userAddress);
	}
	
}
	

	
