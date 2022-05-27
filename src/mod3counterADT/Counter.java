package mod3counterADT;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Counter implements CounterADT {

	private int count;

	/**
	 * Initializes the newly created Counter
	 */
	public Counter() {
		// TODO Auto-generated constructor stub
	}

	public Counter(int count) {
		this.count = count;
	}

	@Override
	public void setCounter(int num) throws InvalidCounterException {
		if (num < 0)
			throw new InvalidCounterException("Negative values are not allowed");
		else
			count = num;

	}

	@Override
	public void incCounter() {
		count++;
	}

	@Override
	public void decCounter() throws InvalidCounterException {
		if (count > 0)
			count--;
		else
			throw new InvalidCounterException("Negative values are not allowed");
	}

	@Override
	public int getCounter() {
		return this.count;
	}

	@Override
	public Boolean isZero() {
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Counter value is " + count;
	}

}
