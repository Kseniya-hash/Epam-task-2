package exception;

public class NullColorException extends Exception {
	
	public NullColorException() {}
	
	public NullColorException(String s) {
		super(s);
	}
	
	public NullColorException(String s, Throwable cause) {
		super(s, cause);
	}
	
	public NullColorException(Throwable cause) {
		super(cause);
	}
}

