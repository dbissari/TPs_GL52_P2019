/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * @author dbissari
 * @param <T>
 *
 */
public interface IStackIterator<T> {
	
	public boolean hasNext();
	
	public T next() throws Exception;
	
}