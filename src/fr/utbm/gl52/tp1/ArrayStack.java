/**
 * 
 */
package fr.utbm.gl52.tp1;

import java.util.ArrayList;

/**
 * extends {@link AbstractStack}
 * A stack implemented with an {@link ArrayList}
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the array stack
 */
public class ArrayStack<T> extends AbstractStack<T> {
	
	private ArrayList<T> stackList;

	public ArrayStack() {
		super();
		this.stackList = new ArrayList<>();
	}

	@Override
	public void push(T element) {
		this.stackList.add(element);
	}

	@Override
	public T pop() throws Exception {
		int lastElementIndex = this.stackList.size()-1;
		T element = this.stackList.get(lastElementIndex);
		try {
			this.stackList.remove(lastElementIndex);
		} catch (Exception e) {
			throw e;
		}
		
		return element;
	}

	@Override
	public int size() {
		return this.stackList.size();
	}

	@Override
	public IStackIterator<T> iterator() {
		return new ArrayStackIterator();
	}

	/**
	 * implements {@link IStackIterator}
	 * An iterator to loop over an {@link ArrayStack} elements
	 * 
	 * @author dbissari
	 */
	@SuppressWarnings("synthetic-access")
	public class ArrayStackIterator implements IStackIterator<T> {
		
		private int currentIndex = ArrayStack.this.stackList.size()-1;

		@Override
		public boolean hasNext() {
			return this.currentIndex >= 0;
		}

		@Override
		public T next() throws Exception {
			if (!this.hasNext()) {
				throw new Exception("No next element"); //$NON-NLS-1$
			}
			// TODO Ensure of the following line
			return ArrayStack.this.stackList.get(this.currentIndex--);
		}

	}

}
