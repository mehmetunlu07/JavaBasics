package com.syntax.class12;

public class Repl114 {
//	Insert spaces after every character in the String s, then return the new string.
//	See below examples (note the space at the end as well)
	 String spaceOut(String s){
		   String str="";
		   for(int i=0; i<s.length();i++){
		     
		     str+=s.charAt(i)+" ";
		   }
		   
		   return str;
		 } 
		 
		 public static void main(String[]args){
			 Repl114 obj=new Repl114();
		    System.out.println(obj.spaceOut("hello"));
		     System.out.println(obj.spaceOut("technology"));
		  
		   
		 }
		}