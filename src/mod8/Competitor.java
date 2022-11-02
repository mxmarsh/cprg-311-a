/**
 * Created on May 10, 2011
 *
 * Project: demo02-SerializationExercise
 */
package mod8;

import java.io.Serializable;

/**
 * Competitor.java
 *
 * @author dwatson
 * @version 1.0
 *
 *          Class Description: Defines a competitor in a competition at a
 *          location.
 */
public class Competitor implements Serializable {
	// Constants
	private static final long serialVersionUID = -8279352638006841533L;

	// Attributes
	private String name;
	private Event event;
	private int yob;

	// Constructors
	/**
	 * Default constructor that sets all instance level variables to their default
	 * values.
	 */
	public Competitor() {
	}

	/**
	 * User defined constructor that allows the programmer to initialize instance
	 * variables at the time of declaration of the object instance.
	 * 
	 * @param name  the competitor's name
	 * @param event the event the competitor has entered
	 * @param yob   competitor's date of birth
	 */
	public Competitor(String name, Event event, int yob) {
		this.name = name;
		this.event = event;
		this.yob = yob;
	}

	// Accessor and Modifier Methods
	/**
	 * Method to return the value of name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set the of name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to return the value of event
	 * 
	 * @return the event
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * Method to set the of event
	 * 
	 * @param event the event to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}

	/**
	 * Method to return the value of yob
	 * 
	 * @return the yob
	 */
	public int getYob() {
		return yob;
	}

	/**
	 * Method to set the of yob
	 * 
	 * @param yob the yob to set
	 */
	public void setYob(int yob) {
		this.yob = yob;
	}

	// Operational Methods
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\n" + getName() + " " + getEvent().toString() + " " + yob;
	}

}
