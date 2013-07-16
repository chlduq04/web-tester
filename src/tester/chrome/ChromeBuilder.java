package tester.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tester.func.FindTag;

public class ChromeBuilder {
	private FindTag find_tag;
	private WebDriver driver;
	public ChromeBuilder(){
		driver = new ChromeDriver();
	}
	public void setUrl( String url ){
		driver.get(url);
	}
}
