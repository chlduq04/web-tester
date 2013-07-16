package tester.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBuilder {
	public ChromeBuilder( String url ){
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
}
