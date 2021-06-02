package by.epamtc.dubovik.ballandbasket.exception;

public class BasketIsOverweightException extends Exception {
	
	public BasketIsOverweightException() {}
	
	public BasketIsOverweightException(String s) {
		super(s);
	}
	
	public BasketIsOverweightException(String s, Throwable cause) {
		super(s, cause);
	}
	
	public BasketIsOverweightException(Throwable cause) {
		super(cause);
	}
}
