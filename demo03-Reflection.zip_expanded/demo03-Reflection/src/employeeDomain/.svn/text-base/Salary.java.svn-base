/**
 * Created on Jan 22, 2008
 *
 * Project: demo5-EmployeeInheritanceExerciseComplete
 */
package employeeDomain;


/**
 *	Salary.java
 *
 * @author dwatson
 * @version 1.0
 *
 * Class Description:  This class represents a Salaried Employee and their
 * associated attributes.
 */
public class Salary extends Employee
{
	//Attributes
	private double 	salary;
	
	//Constructors
	/**
	 * Initializes an empty Employee object with default values for all
	 * attributes.
	 */
	public Salary()
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
	 * @param salary employee's monthly salary
	 */
	public Salary(int id, String name, String address, String phone, long sin,
			String dob, String dept, double salary)
	{
		super(id, name, address, phone, sin, dob, dept);
		this.salary = salary;
	}
	
	//Getter and Setter Methods
	/**
	 * Method to return the value of salary
	 * @return the salary
	 */
	public double getSalary()
	{
		return salary;
	}

	/**
	 * Method to set the of salary
	 * @param salary the salary to set
	 */
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	// Operational Methods
	/* (non-Javadoc)
	 * @see employeeStuff.Employee#calcPay()
	 */
	@Override
	public double calcPay()
	{
		return salary;
	}
	
	/* (non-Javadoc)
	 * @see employeeDomain.Employee#toString()
	 */
	public String toString()
	{
		return super.toString()+" "+salary;
	}
}
