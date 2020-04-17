package com.syntax.class25GroupHW;
//GHw-4
public interface WebDriver {
	void open();
	void close();
	String getTitle();

}
interface TakesScreenShot {
	void getScreenShot();
	
}
interface RemoteWebDriver extends WebDriver,TakesScreenShot{
	void navigate();
	
}

class ChromeDriver implements RemoteWebDriver{
	String title;
	ChromeDriver(String title){
		this.title=title;
	}
	
	@Override
	public void open() {
		System.out.println("ChromeDriver is open");
		
	}

	@Override
	public void close() {
		System.out.println("ChromeDriver is close");
		
	}

	@Override
	public String getTitle() {
		//System.out.println("ChromeDriver got the title");
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("ChromeDriver is navigating");
		
	}

	@Override
	public void getScreenShot() {
		System.out.println("ChromeDriver got ScreenShot");
		
	}
}
class Firefox implements RemoteWebDriver{
	String title;
	Firefox(String title){
	   this.title=title;
	}

	@Override
	public void open() {
		System.out.println("Firefox is open");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox is close");
		
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("Firefox is navigating");
		
	}
	@Override
	public void getScreenShot() {
		System.out.println("Firefox got ScreenShot");
		
	}
	
}
class SafariDriver implements RemoteWebDriver{
	String title;
	SafariDriver(String title){
	   this.title=title;
	}
	@Override
	public void open() {
		System.out.println("SafariDriver is open");
		
	}

	@Override
	public void close() {
		System.out.println("SafariDriver is close");
		
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("SafariDriver is navigating");
		
	}
	public void getScreenShot() {
		System.out.println("SafariDriver got ScreenShot");
		
	}

	
	
}