/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * @author dbissari
 * @param <T>
 *
 */
public interface IStack<T> {
	
	public void push(T element);
	
	public T pop() throws Exception;
	
	public boolean isEmpty();
	
	public int size();
	
	public IStackIterator<T> iterator();
	
}
