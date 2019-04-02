/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * An interface that every type of stack should implement in our program
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the stack
 */
public interface IStack<T> {
	
	/**
	 * Adds an element on top of the stack
	 * 
	 * @param element The element to be added on top of the stack
	 */
	public void push(T element);
	
	/**
	 * Removes the element at the top of the stack
	 * 
	 * @return The element removed from the top of the stack
	 * @throws Exception When it can't pop element (usually when there's no element to pop)
	 */
	public T pop() throws Exception;
	
	/**
	 * Checks if the stack is empty
	 * 
	 * @return Is the stack empty
	 */
	public boolean isEmpty();
	
	/**
	 * Gets the size of the stack
	 * 
	 * @return The number of elements in the stack
	 */
	public int size();
	
	/**
	 * Creates an iterator to loop over  stacked elements
	 * 
	 * @return A new iterator
	 */
	public IStackIterator<T> iterator();
	
}
