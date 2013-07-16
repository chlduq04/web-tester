package tester.func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindTag {
	private WebDriver driver;
	
	public FindTag( WebDriver driver ){
		this.driver = driver;
	}
	
	/**
	 * Click
	 **/
	public FindTag clickXpath( String xpath ){
		driver.findElement( By.xpath(xpath) ).click();
		return this;
	}
	public FindTag clickId( String id ){
		driver.findElement( By.id(id) ).click();
		return this;
	}
	public FindTag clickTag( String tag ){
		driver.findElement( By.tagName(tag) ).click();
		return this;
	}	
	public FindTag clickClass( String tag ){
		driver.findElement( By.tagName(tag) ).click();
		return this;
	} 
	public FindTag clickName( String name ){
		driver.findElement( By.name(name) ).click();
		return this;
	} 

	/**
	 * Send
	 **/
	public FindTag sendXpath( String xpath, String text){
		driver.findElement( By.xpath(xpath) ).sendKeys(text);
		return this;
	}
	public FindTag sendId( String id, String text){
		driver.findElement( By.id(id) ).sendKeys(text);
		return this;
	}
	public FindTag sendTag( String tag, String text){
		driver.findElement( By.tagName(tag) ).sendKeys(text);
		return this;
	}
	public FindTag sendClass( String tag, String text){
		driver.findElement( By.tagName(tag) ).sendKeys(text);
		return this;
	}
	public FindTag sendName( String name, String text){
		driver.findElement( By.name(name) ).sendKeys(text);
		return this;
	}
	
	/**
	 * Check 
	 **/
	public String checkClass( String tag ){
		return driver.findElement( By.tagName(tag) ).getText();
	}
	public String checkXpath( String xpath ){
		return driver.findElement( By.xpath(xpath) ).getText();
	}
	public String checkId( String id ){
		return driver.findElement( By.id(id) ).getText();
	}
	public String checkTag( String tag ){
		return driver.findElement( By.tagName(tag) ).getText();
	}
	public String checkName( String name ){
		return driver.findElement( By.name(name) ).getText();
	}
	
	/**
	 * Delete 
	 **/
	public FindTag deleteXpath( String xpath ){
		driver.findElement( By.xpath(xpath) ).clear();
		return this;
	}
	public FindTag deleteId( String id ){
		driver.findElement( By.id(id )).clear();
		return this;
	}
	public FindTag deleteTag( String tag ){
		driver.findElement( By.tagName(tag) ).clear();
		return this;
	}
	public FindTag deleteClass( String tag ){
		driver.findElement( By.tagName(tag) ).clear();
		return this;
	}
	public FindTag deleteName( String name ){
		driver.findElement( By.name(name) ).clear();
		return this;
	}
}
