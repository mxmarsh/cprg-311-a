/**
 * Created on May 10, 2011
 *
 * Project: demo02-SerializationExercise
 */
package mod8;

import java.io.Serializable;

/**
 * Event.java
 *
 * @author dwatson
 * @version 1.0
 *
 *          Class Description: Defines the event at which a competition takes
 *          place.
 */
public class Event implements Serializable {
	// Constants
	private static final long serialVersionUID = -5086146343267641078L;

	// Attributes
	private String description;
	private Location location;

	// Constructors
	/**
	 * Default constructor that sets all instance level variables to their default
	 * values.
	 */
	public Event() {
	}

	/**
	 * User defined constructor that allows the programmer to initialize instance
	 * variables at the time of declaration of the object instance.
	 * 
	 * @param description event description
	 * @param location    the name of event location
	 */
	public Event(String description, Location location) {
		this.description = description;
		this.location = location;
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
	 * Method to return the value of location
	 * 
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Method to set the of location
	 * 
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	// Operational Methods
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n" + getDescription() + "  " + getLocation().toString();
	}
}
