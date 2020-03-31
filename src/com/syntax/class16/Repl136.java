package com.syntax.class16;
//Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
public class Repl136 {
	String schoolName;
	  int batch;
	  int year;
	  String lastDayOfClass;
	  
	  public Repl136(){
	    
	  }
	  
	  public Repl136(String school, int batchNu, int y, String lastday){
	    schoolName=school;
	    batch=batchNu;
	    year=y;
	    lastDayOfClass=lastday;
	  }
	  void display(){
	    System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	  }
	  
	  public static void main(String[]args){
		Repl136 obj=new Repl136();
	    obj.display(); 
	   
	    Repl136 obj1=new Repl136("Syntax",6,2020,"07/30/2020");
	    obj1.display();
	    
	    
	    
	  }
		
	}