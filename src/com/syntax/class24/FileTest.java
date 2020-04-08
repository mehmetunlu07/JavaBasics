package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File java = new JavaFile();
		File word = new WordFile();
		File pdf = new PDFFile();

		java.open();
		java.edit();
		java.close();
		System.out.println("-----------------");
		word.open();
		word.edit();
		word.close();
		System.out.println("-----------------");
		pdf.open();
		pdf.edit();
		pdf.close();
	}

}
