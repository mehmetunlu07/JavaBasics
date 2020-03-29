package com.syntax.class16;
//2.Write program as a Book class that will have 2 Constructors. 
//While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
public class Book {
	String bookName;
	int pageNum;
	
	public Book() {
		this("History",400);
		System.out.println("It is non-argument constructor");
		
		
	}
	
	public Book(String s, int n) {
		System.out.println("It is parameterized constructor");
		System.out.println("Local variables are "+s+" "+n);
		bookName=s;
		pageNum=n;
		System.out.println("Instance variables "+ this.bookName+" "+this.pageNum);
		
	}
	public static void main(String[] args) {
		Book obj=new Book();
		System.out.println(obj.bookName+" "+obj.pageNum);
		System.out.println("*********************************");
		obj=new Book("Science",250);
		

	}

}
