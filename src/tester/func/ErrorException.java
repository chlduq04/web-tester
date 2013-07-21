package tester.func;

public class ErrorException {
	public ErrorException(){
		
	}
	public void printError( String function, String url, String value ){
		System.out.println("FUNCTION : "+function+", URL : "+url+", VALUE : "+value+" NOT FOUND!!");
	}
}
