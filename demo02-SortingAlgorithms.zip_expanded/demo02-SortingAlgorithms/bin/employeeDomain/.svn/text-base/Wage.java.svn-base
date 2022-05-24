/**
 * Created on Jan 22, 2008
 *
 * Project: demo5-EmployeeInheritanceExerciseComplete
 */
package employeeDomain;


/**
 *	Wage.java
 *
 * @author dwatson
 * @version 1.0
 *
 * Class Description: This class represents a Part Time Employee and their
 * associated attributes. 
 */
public class Wage extends Employee
{
	//Constants
	private final double 		OVER_TIME = 40;
	
	//Attributes
	private double 		hours;
	private double			rate;
	
	//Constructors
	/**
	 * Initializes an empty Wage Employee object with default values for all
	 * attributes.
	 */
	public Wage()
	{
	}

	/**
	 * User defined constructor to initialize
	 * all class level attributes.
	 * @param id employee's id number
	 * @param name employee's first and last names
	 * @param address employee's address
	 * @param phone employee's phone number
	 * @param sin employee's social insurance number
	 * @param dob employee's date of birth
	 * @param dept employee's home department
	 * @param rate employee's hourly rate of pay
	 * @param hours employee's number of hours work on a weekly basis
	 */
	public Wage(int id, String name, String address, String phone, long sin,
			String dob, String dept, double rate, double hours)
	{
		super(id, name, address, phone, sin, dob, dept);
		this.hours = hours;
		this.rate = rate;
	}
	
	//Getter and Setter Methods
	/**
	 * Method to return the value of hours
	 * @return the hours
	 */
	public double getHours()
	{
		return hours;
	}

	/**
	 * Method to set the of hours
	 * @param hours the hours to set
	 */
	public void setHours(double hours)
	{
		this.hours = hours;
	}

	/**
	 * Method to return the value of rate
	 * @return the rate
	 */
	public double getRate()
	{
		return rate;
	}

	/**
	 * Method to set the of rate
	 * @param rate the rate to set
	 */
	public void setRate(double rate)
	{
		this.rate = rate;
	}

	/**
	 * Method to return the value of oVER_TIME
	 * @return the oVER_TIME
	 */
	public double getOVER_TIME()
	{
		return OVER_TIME;
	}

	//Operational Methods
	/* (non-Javadoc)
	 * @see employeeStuff.Employee#calcPay()
	 */
	@Override
	public double calcPay()
	{
		double pay = 0;
		if(hours > OVER_TIME)
		{
			pay = (rate * OVER_TIME) + (rate * 1.5 *(hours - OVER_TIME));
		}
		else
		{
			pay = rate * hours;
		}
		return pay;
	}
	
	/* (non-Javadoc)
	 * @see employeeDomain.Employee#toString()
	 */
	public String toString()
	{
		return super.toString()+ " "+rate+ " "+hours;
	}
}
