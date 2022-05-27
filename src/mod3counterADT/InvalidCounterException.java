package mod3counterADT;

public class InvalidCounterException extends Exception {

	/**
	 * 
	 * Initializes the newly created InvalidCounterException
	 */
	public InvalidCounterException() {
		super();
	}

	/**
	 * 
	 * Initializes the newly created InvalidCounterException
	 * 
	 * @param message Specific error message.
	 */
	public InvalidCounterException(String message) {
		super(message);
	}
}
