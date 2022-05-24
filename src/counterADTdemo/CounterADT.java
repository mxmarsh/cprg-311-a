package counterADTdemo;

/**
 * Class description: This interface represents the public contract for the
 * implementation of Counter.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public interface CounterADT {

	/**
	 * Mutator method to change the value of counter.
	 * 
	 * Precondition: A valid Counter object exists, and an integer is provided.
	 * 
	 * Postcondition: The counter has changed to the provided value.
	 * 
	 * @param num The new value of counter.
	 * @exception InvalidCounterException if a negative value is provided.
	 */
	public void setCounter(int num) throws InvalidCounterException;

	/**
	 * Mutator method to increment the value of counter by 1.
	 * 
	 * Precondition: A valid Counter object exists with a value for counter.
	 * 
	 * Postcondition: The value of the counter has increased by 1.
	 */
	public void incCounter();

	/**
	 * Mutator method to decrement the value of counter by 1.
	 * 
	 * Precondition: A valid Counter object exists with a value for counter greater
	 * than zero.
	 * 
	 * Postcondition: The value of the counter has decreased by 1.
	 * 
	 * @throws InvalidCounterException is thrown if the counter was previously set
	 *                                 to zero.
	 */
	public void decCounter() throws InvalidCounterException;

	/**
	 * Accessor method to return the value of the counter.
	 * 
	 * Precondition: A valid Counter object exists
	 * 
	 * Postcondition: An integer representing the current counter value is returned.
	 * 
	 * @return the integer value of the counter.
	 */
	public int getCounter();

	/**
	 * Override Object.toString().
	 * 
	 * Precondition: A valid Counter object exists.
	 * 
	 * Postcondition: A String representing the current counter value is returned.
	 * 
	 * @return the String representation of the current counter value.
	 */
	@Override
	public String toString();

	/**
	 * Transformer method to check if the counter is zero.
	 * 
	 * Precondition: A valid Counter object exists.
	 * 
	 * Postcondition: A Boolean value representing whether the current counter has a
	 * value of zero.
	 * 
	 * @return true if the current counter value is exactly zero, otherwise false
	 */
	public Boolean isZero();

}
