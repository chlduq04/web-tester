package tester.func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindTag {
	private WebDriver driver;
	
	public void SetDriver( WebDriver driver ){
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
	 * getText 
	 **/
	public String getTextClass( String tag ){
		return driver.findElement( By.tagName(tag) ).getText();
	}
	public String getTextXpath( String xpath ){
		return driver.findElement( By.xpath(xpath) ).getText();
	}
	public String getTextId( String id ){
		return driver.findElement( By.id(id) ).getText();
	}
	public String getTextTag( String tag ){
		return driver.findElement( By.tagName(tag) ).getText();
	}
	public String getTextName( String name ){
		return driver.findElement( By.name(name) ).getText();
	}
	
	/**
	 * clear 
	 **/
	public FindTag clearXpath( String xpath ){
		driver.findElement( By.xpath(xpath) ).clear();
		return this;
	}
	public FindTag clearId( String id ){
		driver.findElement( By.id(id )).clear();
		return this;
	}
	public FindTag clearTag( String tag ){
		driver.findElement( By.tagName(tag) ).clear();
		return this;
	}
	public FindTag clearClass( String tag ){
		driver.findElement( By.tagName(tag) ).clear();
		return this;
	}
	public FindTag clearName( String name ){
		driver.findElement( By.name(name) ).clear();
		return this;
	}
}
