package tester.func;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Orders {
	public String type;
	public String target;
	public String name;
	public String text;
	public String result;
	public String url;
	public boolean urlLoad = false;
	public Orders( String type, String filename ){
		this.type = type;
		this.name = filename;
	}
	public Orders( String url ){
		this.url = url;
		urlLoad = true;
	}
	public Orders( String type,String target, String name, String text ){
		this.type = type.toLowerCase();
		this.target = target.toLowerCase();
		this.name = name;
		this.text = text;
	}
	public Orders( String type,String target, String name ){
		this.type = type.toLowerCase();
		this.target = target.toLowerCase();
		this.name = name;
		this.text = null;
	}
}
