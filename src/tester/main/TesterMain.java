package tester.main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import tester.builder.AllBuilder;
import tester.func.Orders;

public class TesterMain extends TesterSetting{
	private Vector<Orders> ordersChrome;
	private Vector<Orders> ordersfirefox;
	private Vector<Orders> ordersIE;
	
	private int testCount;
	private AllBuilder driver;

	public TesterMain()
	{
		driver = new AllBuilder();
		ordersChrome = new Vector<Orders>();
		ordersfirefox = new Vector<Orders>();
		ordersIE = new Vector<Orders>();

		startTest();
	}

	public int checkCount( boolean start )
	{
		if( start )
			testCount = 0;
		return testCount++;
	}
	public void setOrders(){
		setOrder(ordersChrome,"http://www.google.co.kr");
		setOrder(ordersChrome,"source", "google");
		setOrder(ordersChrome,"send","Id","gbqfq","test");
		setOrder(ordersChrome,"click","Id","gbqfb");
	}
	public void startTest()
	{
		setOrders();
		
		if(readyChrome) startChrome();
		if(readyInternetExplorer) startInternetExplorer();
		if(readyFireFox) startFirefox();
		if(closeForComplete) driver.quit();
		
		System.out.println("All test complete");
	}
	public void startChrome(){
		try{
			driver.init( new ChromeDriver() );
			checkOrders( ordersChrome );
			ordersChrome.clear();
			System.out.println("Chrome test complete");
		}catch(Exception e){
			System.out.println("Chrome test complete");
		}
	}
	public void startFirefox(){
		try{
			driver.init( new FirefoxDriver() );
			checkOrders( ordersfirefox );			
			ordersfirefox.clear();
			System.out.println("Firefox test complete");
		}catch(Exception e){
			System.out.println("Firefox test complete");
		}
	}
	public void startInternetExplorer(){
		try{
			driver.init( new InternetExplorerDriver() );
			checkOrders( ordersIE );
			ordersIE.clear();
			System.out.println("IE test complete");
		}catch(Exception e){
			System.out.println("IE test complete");
		}
	}

	public void setOrder( Vector<Orders> orders, String get, String filename ){
		orders.add( new Orders( get, filename ) );
	}
	public void setOrder( Vector<Orders> orders, String url ){
		orders.add( new Orders( url ) );
	}
	public void setOrder( Vector<Orders> orders, String type, String target, String name, String text ){
		orders.add( new Orders( type, target, name, text) );
	}
	public void setOrder( Vector<Orders> orders, String type, String target, String name ){
		orders.add( new Orders( type, target, name ) );
	}

	public void checkOrders( Vector<Orders> orders ){
		for( Orders now : orders ){
			if(now.urlLoad){
				driver.start(now.url);
			}
			else{
				switch( now.type ){
				case "click" :
					checkClickTarget( now.target, now.name );
					break;
				case "send" :
					checkSendTarget( now.target, now.name, now.text );
					break;
				case "gettext" :
					checkGettextTarget( now.target, now.name, now );
					break;
				case "clear" :
					checkClearTarget( now.target, now.name );
					break;
				case "source" : 
					makeFile( now.name, driver.getPageSource() );
					break;
				case "screenshot":
					driver.takePicture(now.name);
					break;
				default :
					break;
				}
			}
		}
	}
	
	public void checkClickTarget( String now, String name ){
		switch( now ){
		case "id" :
			driver.clickId(name);
			break;
		case "class" :
			driver.clickClass(name);
			break;
		case "name" :
			driver.clickName(name);
			break;
		case "tag" :
			driver.clickTag(name);
			break;
		case "xpath" : 
			driver.clickXpath(name);
			break;
		default : 
			break;
		}
	}

	public void checkSendTarget( String now, String name, String text ){
		switch( now ){
		case "id" :
			driver.sendId( name, text );
			break;
		case "class" :
			driver.sendClass( name, text );
			break;
		case "name" :
			driver.sendName( name, text );
			break;
		case "tag" :
			driver.sendTag( name, text );
			break;
		case "xpath" : 
			driver.sendXpath( name, text );
			break;
		default : 
			break;
		}
	}

	public void checkGettextTarget( String now, String name, Orders order ){
		switch( now ){
		case "id" :
			order.text = driver.getTextId(name);
			break;
		case "class" :
			order.text = driver.getTextClass(name);
			break;
		case "name" :
			order.text = driver.getTextName(name);
			break;
		case "tag" :
			order.text = driver.getTextTag(name);
			break;
		case "xpath" : 
			order.text = driver.getTextXpath(name);
			break;
		default : 
			break;
		}
	}

	public void checkClearTarget( String now, String name ){
		switch( now ){
		case "id" :
			driver.clearId(name);
			break;
		case "class" :
			driver.clearClass(name);
			break;
		case "name" :
			driver.clearName(name);
			break;
		case "tag" :
			driver.clearTag(name);
			break;
		case "xpath" : 
			driver.clearXpath(name);
			break;
		default : 
			break;
		}
	}
	
	public void makeFile( String filename, String text ){
		try{
			File f = new File(filename+".html");
			FileWriter outFile = new FileWriter(f);
			PrintWriter out = new PrintWriter(outFile);
			out.println(text);
		}catch( Exception e ){
			System.err.println("CAN NOT MAKE NEW FILE!!");
		}
	}
}
