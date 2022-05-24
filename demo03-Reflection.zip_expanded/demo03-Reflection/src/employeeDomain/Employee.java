/**
 * Created on Jan 22, 2008
 *
 * Project: demo5-EmployeeInheritanceExerciseComplete
 */
package employeeDomain;


/**
 *	Employee.java
 *
 * @author dwatson
 * @version 1.0
 *
 * Class Description:  This class represents an Employee and their
 * associated attributes.
 */
public abstract class Employee
{
	//Attributes
	private int			id;
	private String		name;
	private String 		address;
	private String		phone;
	private long		sin;
	private String		dob;
	private	String		dept;
	
	//Constructors
	/**
	 * Initializes an empty Employee object with default values for all
	 * attributes.
	 */
	public Employee()
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
	 */
	public Employee(int id, String name, String address, String phone,
			long sin, String dob, String dept)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sin = sin;
		this.dob = dob;
		this.dept = dept;
	}
	
	//Getter and Setter Methods
	/**
	 * Method to return the value of id
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Method to set the of id
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Method to return the value of name
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method to set the of name
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method to return the value of address
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * Method to set the of address
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * Method to return the value of phone
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * Method to set the of phone
	 * @param phone the phone to set
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * Method to return the value of sin
	 * @return the sin
	 */
	public long getSin()
	{
		return sin;
	}

	/**
	 * Method to set the of sin
	 * @param sin the sin to set
	 */
	public void setSin(long sin)
	{
		this.sin = sin;
	}

	/**
	 * Method to return the value of dob
	 * @return the dob
	 */
	public String getDob()
	{
		return dob;
	}

	/**
	 * Method to set the of dob
	 * @param dob the dob to set
	 */
	public void setDob(String dob)
	{
		this.dob = dob;
	}

	/**
	 * Method to return the value of dept
	 * @return the dept
	 */
	public String getDept()
	{
		return dept;
	}
	
	/**
	 * Method to set the of dept
	 * @param dept the dept to set
	 */
	public void setDept(String dept)
	{
		this.dept = dept;
	}

	//Operational Methods
	/**
	 * Method to calculate pay for various types of employees.  This method
	 * will be specifically defined in the child class.
	 * @return the pay value calculated appropriately for this type of employee.
	 */
	public abstract double calcPay();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return id+" "+name+" "+address+" "+
				phone+" "+sin+" "+dob+" "+
				dept;
	}
}
