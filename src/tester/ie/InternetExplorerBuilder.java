package tester.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import tester.func.FindTag;

public class InternetExplorerBuilder {
	private FindTag find_tag;
	private WebDriver driver;
	public InternetExplorerBuilder(){
		driver = new InternetExplorerDriver();
	}
	public void setUrl( String url ){
		driver.get(url);
	}
	
}
