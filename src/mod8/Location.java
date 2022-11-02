/**
 * Created on May 10, 2011
 *
 * Project: demo02-SerializationExercise
 */
package mod8;

import java.io.Serializable;

/**
 * Location.java
 *
 * @author dwatson
 * @version 1.0
 *
 *          Class Description: Defines the location of a competition event.
 */
public class Location implements Serializable {
	// Constants
	private static final long serialVersionUID = -497720710290152459L;

	// Attributes
	private String description;
	private String address;

	// Constructors
	/**
	 * Default constructor that sets all instance level variables to their default
	 * values.
	 */
	public Location() {
	}

	/**
	 * User defined constructor that allows the programmer to initialize instance
	 * variables at the time of declaration of the object instance.
	 * 
	 * @param description general description of event location
	 * @param address     the event location address
	 */
	public Location(String description, String address) {
		this.description = description;
		this.address = address;
	}

	// Accessor and Modifier Methods
	/**
	 * Method to return the value of description
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Method to set the of description
	 * 
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Method to return the value of address
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method to set the of address
	 * 
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	// Operational Methods
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n" + getDescription() + "   " + getAddress();
	}
}
