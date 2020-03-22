package com.syntax.class12;

public class PhoneType {

	public static void main(String[] args) {
//		Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors
		
		Phone iPhone=new Phone();
		iPhone.brand="iPhone";
		iPhone.size=10;
		iPhone.batLife=20;
		iPhone.ram=4;
		iPhone.call();
		iPhone.photo();
		iPhone.liveCall();
		
		Phone android=new Phone();
		android.brand="Android";
		android.size=9;
		android.batLife=15;
		android.ram=3;
		android.call();
		android.photo();
		android.liveCall();
		
		Phone nokia=new Phone();
		nokia.brand="Nokia";
		nokia.size=5;
		nokia.batLife=10;
		nokia.ram=2;
		nokia.call();
		nokia.photo();
		nokia.liveCall();
		

	}
}
