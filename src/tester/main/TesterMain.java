package tester.main;

import java.util.Vector;

import tester.chrome.ChromeBuilder;
import tester.func.FindTag;
import tester.func.Orders;
import tester.ie.InternetExplorerBuilder;

public class TesterMain {
	private String url;

	private static ChromeBuilder chrome;
	private static InternetExplorerBuilder iexplorer;
	
	private Vector<Orders> orders;

	public boolean readyChrome;
	public boolean readyExplorer;
	public boolean readyFireFox;
	
	static{
		chrome = new ChromeBuilder();
		iexplorer = new InternetExplorerBuilder();
	}

	public TesterMain(){
		orders = new Vector<Orders>();
		readyChrome = false;
		readyExplorer = false;
		readyFireFox = false;
	}

	public void setUrl( String url ){
		this.url = url;
		chrome.setUrl(url);
		iexplorer.setUrl(url);
	}
	
}
