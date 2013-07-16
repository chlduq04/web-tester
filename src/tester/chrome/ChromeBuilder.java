package tester.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tester.func.FindTag;

public class ChromeBuilder extends FindTag{
	private FindTag find_tag;
	private static WebDriver driver;
	private String url;
	public ChromeBuilder(){
		driver = new ChromeDriver();
		super.SetDriver(driver);
	}
	public void setUrl( String url ){
		this.url = url;
	}
	public void startTest(){
		driver.get(url);
	}
	public void click(){
		
	}
	public void send(){
		
	}
	public void getText(){
		
	}
	public void clear(){
		
	}
}
