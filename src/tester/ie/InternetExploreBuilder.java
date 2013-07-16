package tester.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExploreBuilder {
	public InternetExploreBuilder( String url ){
		WebDriver driver = new InternetExplorerDriver();
		driver.get(url);
	}
}
