package tester.main;

import java.util.HashMap;
import java.util.Vector;

import tester.chrome.ChromeBuilder;
import tester.func.FindTag;
import tester.func.Orders;
import tester.ie.InternetExplorerBuilder;

public class TesterMain extends TesterSetting{
	private String url;

	private static ChromeBuilder chrome;
	private static InternetExplorerBuilder iexplorer;
	private Vector<Orders> orders;
	
	static{
		chrome = new ChromeBuilder();
		iexplorer = new InternetExplorerBuilder();
	}

	public TesterMain(){
		orders = new Vector<Orders>();
	}

	public void setUrl( String url ){
		this.url = url;
		chrome.setUrl(url);
		iexplorer.setUrl(url);
	}
	
	public void setOrder( String type, String name ){
		switch (type.toLowerCase()) {
		case "click":
			break;
		default:
			break;
		}
		orders.add(new Orders(type, name));
	}
	
	public void clearOrder(){
		orders.clear();
	}
	
	public Vector<Orders> getOrder(){
		return orders;
	}
	
}
