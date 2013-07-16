package tester.main;

public class Tester {
	public static void main(String args[]){
		System.setProperty( "webdriver.chrome.driver", "./server/chromedriver.exe" );
		System.setProperty( "webdriver.ie.driver", "./server/IEDriverServer.exe" );
		TesterMain m = new TesterMain();
	}
}