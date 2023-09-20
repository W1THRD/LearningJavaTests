package book3;

public class HungerException extends Exception {

	private static final long serialVersionUID = 444980417262517562L;

	public HungerException() {
		
	}

	public HungerException(String message) {
		super(message);
	}

	public HungerException(Throwable cause) {
		super(cause);
	}

	public HungerException(String message, Throwable cause) {
		super(message, cause);
	}

	public HungerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
