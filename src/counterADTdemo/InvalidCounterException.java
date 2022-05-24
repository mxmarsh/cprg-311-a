package counterADTdemo;

/**
 * Class description: A counter has been provided an invalid value.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

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
