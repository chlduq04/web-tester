package tester.func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tester.main.TesterDebug;

public class FindTag {
	protected WebDriver driver;
	/**
	 * Click
	 **/
	public FindTag clickXpath( String xpath ){
		try{
			driver.findElement( By.xpath(xpath) ).click();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", XPATH : "+xpath+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
//			//driver.quit();
		}
		return this;
	}
	public FindTag clickId( String id ){
		try{
			driver.findElement( By.id(id) ).click();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", ID : "+id+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
		}
		return this;
	}
	public FindTag clickTag( String tag ){
		try{
			driver.findElement( By.tagName(tag) ).click();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", TAG : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}	
	public FindTag clickClass( String tag ){
		try{
			driver.findElement( By.tagName(tag) ).click();			
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", CLASS : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	} 
	public FindTag clickName( String name ){
		try{
			driver.findElement( By.name(name) ).click();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", NAME : "+name+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	} 

	/**
	 * Send
	 **/
	public FindTag sendXpath( String xpath, String text ){
		try{
			driver.findElement( By.xpath(xpath) ).sendKeys(text);
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", XPATH : "+xpath+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag sendId( String id, String text ){
		try{
			driver.findElement( By.id(id) ).sendKeys(text);
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", ID : "+id+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag sendTag( String tag, String text ){
		try{
			driver.findElement( By.tagName(tag) ).sendKeys(text);
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", TAG : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag sendClass( String tag, String text ){
		try{
			driver.findElement( By.tagName(tag) ).sendKeys(text);
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", CLASS : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag sendName( String name, String text ){
		try{
			driver.findElement( By.name(name) ).sendKeys(text);
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", NAME : "+name+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}

	/**
	 * getText 
	 **/
	public String getTextClass( String tag ){
		try{
			return driver.findElement( By.tagName(tag) ).getText();			
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", CLASS : "+tag+" NOT FOUND!!");
			}else{		
				e.printStackTrace();
			}			
			//driver.quit();
			return e.toString();
		}
	}
	public String getTextXpath( String xpath ){
		try{
			return driver.findElement( By.xpath(xpath) ).getText();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", XPATH : "+xpath+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
			return e.toString();
		}
	}
	public String getTextId( String id ){
		try{
			return driver.findElement( By.id(id) ).getText();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", ID : "+id+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
			return e.toString();
		}
	}
	public String getTextTag( String tag ){
		try{
			return driver.findElement( By.tagName(tag) ).getText();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", TAG : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
			return e.toString();
		}
	}
	public String getTextName( String name ){
		try{
			return driver.findElement( By.name(name) ).getText();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", NAME : "+name+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
			return e.toString();
		}
	}

	/**
	 * clear 
	 **/
	public FindTag clearXpath( String xpath ){
		try{
			driver.findElement( By.xpath(xpath) ).clear();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", XPATH : "+xpath+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag clearId( String id ){
		try{
			driver.findElement( By.id(id )).clear();			
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", ID : "+id+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag clearTag( String tag ){
		try{
			driver.findElement( By.tagName(tag) ).clear();			
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", TAG : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag clearClass( String tag ){
		try{
			driver.findElement( By.tagName(tag) ).clear();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("URL : "+driver.getCurrentUrl()+", CLASS : "+tag+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
	public FindTag clearName( String name ){
		try{
			driver.findElement( By.name(name) ).clear();
		}catch(Exception e){
			if(TesterDebug.PRINTDEBUG.get()){
				System.err.println("FUNCTION : clearName, URL : "+driver.getCurrentUrl()+", NAME : "+name+" NOT FOUND!!");
			}else{
				e.printStackTrace();
			}
			//driver.quit();
		}
		return this;
	}
}
