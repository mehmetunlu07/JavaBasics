package com.syntax.class11;

public class StringManip4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a="   Saturday   ";
		 String b="14";
		 String c="";
		 String e="Welcome";
		 String f="WelCOME ";
		 
		 System.out.println(a.toUpperCase());   //change to uppercase
		 System.out.println(a.toLowerCase());   //change to lowercase
		 
		 
		 System.out.println(a.concat(" "+b));          // concat two string
		 System.out.println("**************************");
		 
		 boolean x=c.isEmpty();   // return true if the string is empty or return false
		 System.out.println(x);
		 
		 String d=a.trim();    //removes spaces
		 System.out.println(d);
		 
		 if(e.equals(f)) {       // checked the strings
			 System.out.println("Passed");
		 } else {
			 System.out.println("Not passed");
		 }
		 
		 if(f.trim().equalsIgnoreCase(e)) {       // trim the space and IgnoreCase
			 System.out.println("Passed");
		 }else {
			 System.out.println("Not passed");
		 }
		 
	}

}
