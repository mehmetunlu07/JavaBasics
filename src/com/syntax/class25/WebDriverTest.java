package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.openBrowser();
		ch.closeBrowser();
		ch.maximizeWindow();
		ch.findElement();
		ch.takePicture();
		ch.takePanoramaPic();
		
		
		System.out.println();
		//ch.takeSelfie();   // static method close to child class
		TakesScreenshot.takeSelfie(); 
		//ch.A=".com";  //final variable can not assigned
		System.out.println(TakesScreenshot.A);
	}

}
