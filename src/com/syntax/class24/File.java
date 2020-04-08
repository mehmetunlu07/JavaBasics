package com.syntax.class24;
//Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method 

//while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

public abstract class File {

	public abstract void open();

	public void edit() {
		System.out.println("File class method edit");
	}

	public void close() {
		System.out.println("File class method close");

	}
}

class JavaFile extends File{
	public void open() {
		System.out.println("JavaFile class method open");
	}
}

class WordFile extends File{
	public void open() {
		System.out.println("WordFile class method open");
	}
}

class PDFFile extends File{
	public void open() {
		System.out.println("PDFFile class method open");
	}
}