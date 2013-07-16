package tester.func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindTag {
	private WebElement ele;

	public FindTag clickAppXpath( String xpath ,WebDriver driver ){
		ele = driver.findElement(By.xpath(xpath));
		ele.click();
		return this;
	}
	public FindTag clickAppId(String id,WebDriver driver){
		ele = driver.findElement(By.id(id));
		ele.click();
		return this;
	}
	public FindTag clickAppTag(String tag,WebDriver driver){
		ele = driver.findElement(By.tagName(tag));
		ele.click();
		return this;
	}	
	public FindTag clickAppClass(String tag,WebDriver driver){
		ele = driver.findElement(By.tagName(tag));
		ele.click();
		return this;
	} 
	public FindTag clickAppName(String name,WebDriver driver){
		ele = driver.findElement(By.name(name));
		ele.click();
		return this;
	} 


	public FindTag makeAppXpath(String xpath,WebDriver driver,String text){
		ele = driver.findElement(By.xpath(xpath));
		ele.sendKeys(text);
		return this;
	}
	public FindTag makeAppId(String id,WebDriver driver,String text){
		ele = driver.findElement(By.id(id));
		ele.sendKeys(text);
		return this;
	}
	public FindTag makeAppTag(String tag,WebDriver driver,String text){
		ele = driver.findElement(By.tagName(tag));
		ele.sendKeys(text);
		return this;
	}
	public FindTag makeAppClass(String tag,WebDriver driver,String text){
		ele = driver.findElement(By.tagName(tag));
		ele.sendKeys(text);
		return this;
	}
	public FindTag makeAppName(String name,WebDriver driver,String text){
		ele = driver.findElement(By.name(name));
		ele.sendKeys(text);
		return this;
	}
	
	
	
	
	public String checkAppClass(String tag,WebDriver driver){
		String ret_Str;
		ele = driver.findElement(By.tagName(tag));
		ret_Str = ele.getText();
		ele = null;
		return ret_Str;
	}
	public String checkAppXpath(String xpath,WebDriver driver){
		String ret_Str;
		ele = driver.findElement(By.xpath(xpath));
		ret_Str = ele.getText();
		ele = null;
		return ret_Str;
	}
	public String checkAppId(String id,WebDriver driver){
		String ret_Str;
		ele = driver.findElement(By.id(id));
		ret_Str = ele.getText();
		ele = null;
		return ret_Str;
	}
	public String checkAppTag(String tag,WebDriver driver){
		String ret_Str;
		ele = driver.findElement(By.tagName(tag));
		ret_Str = ele.getText();
		ele = null;
		return ret_Str;
	}
	public String checkAppName(String name,WebDriver driver){
		String ret_Str;
		ele = driver.findElement(By.name(name));
		ret_Str = ele.getText();
		ele = null;
		return ret_Str;
	}

	
	
	public FindTag deleteAppXpath(String xpath,WebDriver driver){
		ele = driver.findElement(By.xpath(xpath));
		ele.clear();
		return this;
	}
	public FindTag deleteAppId(String id,WebDriver driver){
		ele = driver.findElement(By.id(id));
		ele.clear();
		return this;
	}
	public FindTag deleteAppTag(String tag,WebDriver driver){
		ele = driver.findElement(By.tagName(tag));
		ele.clear();
		return this;
	}
	public FindTag deleteAppClass(String tag,WebDriver driver){
		ele = driver.findElement(By.tagName(tag));
		ele.clear();
		return this;
	}
	public FindTag deleteAppName(String name,WebDriver driver){
		ele = driver.findElement(By.name(name));
		ele.clear();
		return this;
	}
}
