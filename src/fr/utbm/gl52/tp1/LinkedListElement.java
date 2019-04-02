/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * A class to store element of linked lists
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored
 */
public class LinkedListElement<T> {
	
	private T value;
	private LinkedListElement<T> nextElement;
	
	/**
	 * A constructor with the value of the element to be stored
	 * 
	 * @param value The value of the element to be stored
	 */
	public LinkedListElement(T value) {
		this.value = value;
		this.nextElement = null;
	}

	/**
	 * Gets the value of the element
	 * 
	 * @return The value of the element
	 */
	public T getValue() {
		return this.value;
	}

	/**
	 * Sets the value of the element
	 * 
	 * @param value
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * Gets the following element linked to
	 * 
	 * @return The following element | {@link null} if no element
	 */
	public LinkedListElement<T> getNextElement() {
		return this.nextElement;
	}

	/**
	 * Gets the following element linked to
	 * 
	 * @param nextElement The following element to link to
	 */
	public void setNextElement(LinkedListElement<T> nextElement) {
		this.nextElement = nextElement;
	}	

}
