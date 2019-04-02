/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * implements {@link IStack}
 * An abstract stack class created to pool common behavior of stacks
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the stack
 */
public abstract class AbstractStack<T> implements IStack<T> {

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}
}
