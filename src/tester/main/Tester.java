package tester.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Tester {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./chromedriver_win32_2.1/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./IEDriverServer_Win32_2.33.0/IEDriverServer.exe");
	}
}