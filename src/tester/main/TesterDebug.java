package tester.main;

public enum TesterDebug {
	PRINTDEBUG(true);

	boolean str;
	TesterDebug(boolean str) {
		this.str = str;
	}
	public boolean get(){
		return str;
	}
}
