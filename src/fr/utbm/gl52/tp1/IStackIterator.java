/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * An interface for iterators which will be needed for every type of stack
 * 
 * @author dbissari
 * @param <T> The type of the element which is stored in the stack to loop on
 */
public interface IStackIterator<T> {
	
	/**
	 * Checks if the iterator is on the last element of its stack
	 * 
	 * @return Does the iterator's cursor has next element
	 */
	public boolean hasNext();
	
	/**
	 * Move the iterator's cursor to the following element
	 * 
	 * @return The following element
	 * @throws Exception When there is no next element
	 */
	public T next() throws Exception;
	
}