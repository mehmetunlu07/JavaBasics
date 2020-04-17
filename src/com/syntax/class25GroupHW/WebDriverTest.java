package com.syntax.class25GroupHW;

public class WebDriverTest {

	public static void main(String[] args) {
		
		RemoteWebDriver[] arr= {new ChromeDriver("Amazon"),new Firefox("BestBuy"), new SafariDriver("Syntax.com")};
		for(RemoteWebDriver i:arr) {
		i.open();
		i.close();
		System.out.println(i.getTitle());
		i.navigate();
		i.getScreenShot();
		System.out.println();
		}
		
		
		//TakesScreenShot t=new TakesScreenShot();  //CE can not instantiate
		//new TakesScreenShot();  //CE
		//new RemoteWebDriver();  //CE
	}

}
