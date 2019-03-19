/**
 * 
 */
package fr.utbm.gl52.tp1;

import java.util.ArrayList;

/**
 * @author dbissari
 * @param <T>
 *
 */
public class ArrayStack<T> extends AbstractStack<T> {
	
	ArrayList<T> stackList;

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
	public boolean isEmpty() {
		return this.stackList.isEmpty();
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
	 * @author dbissari
	 *
	 */
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
