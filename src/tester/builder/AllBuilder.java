package tester.builder;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tester.func.FindTag;

public class AllBuilder extends FindTag{
	private FindTag find_tag;
	private String url;
	private String nowUrl;
	private Vector<String> urls;
	private String errMessage;

	public AllBuilder(){
		urls = new Vector<String>();
		errMessage = "Chrome-Test-Error";
	}
	public void init( WebDriver driver ){
		super.driver = driver;
	}
	public void start( String url ){
		this.url = url;
		driver.get(url);
	}
	public void end(){
		driver.close();
	}
	public void quit(){
		driver.quit();
	}
	public String getPageSource(){
		return driver.getPageSource();
	}
	
	public String urls( boolean put ){
		if(put){
			String argu = driver.getCurrentUrl();
			urls.add(argu);
			return argu; 
		}
		urls.add(errMessage);
		return errMessage;
	}
	
	public Vector<String> getUrls(){
		return urls;
	}
	
	public void takePicture( String filename ){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File(filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
