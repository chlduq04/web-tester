package tester.main;

import java.util.HashMap;

public class TesterSetting {
	public static HashMap<String, Integer> typeKeyword;
	public static int typeKeywordCount;
	public static boolean readyChrome;
	public static boolean readyExplorer;
	public static boolean readyFireFox;
	
	public TesterSetting(){
		typeKeyword = new HashMap<String, Integer>(){
			private static final long serialVersionUID = 20130717L;
			{
				put("chrome", 1);
				put("internetexplorer", 2);
				put("ie", 2);
				put("firefox", 3);
			}
		};
		readyChrome = false;
		readyExplorer = false;
		readyFireFox = false;
		typeKeywordCount = 4;
	}
	
	public int setSetting( String key ){
		typeKeyword.put(key, typeKeywordCount++);
		return typeKeywordCount-1;
	}
	
	public HashMap<String, Integer> getSetting(){
		return typeKeyword;
	}
	
	public int findSetting( String key ){
		return typeKeyword.get(key);
	}
}
