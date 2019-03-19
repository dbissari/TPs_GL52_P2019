/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * @author dbissari
 * @param <T>
 *
 */
public class LinkedListElement<T> {
	
	private T value;
	private LinkedListElement<T> nextElement;
	
	public LinkedListElement(T element) {
		this.value = element;
		this.nextElement = null;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T element) {
		this.value = element;
	}

	public LinkedListElement<T> getNextElement() {
		return this.nextElement;
	}

	public void setNextElement(LinkedListElement<T> nextElement) {
		this.nextElement = nextElement;
	}	

}
