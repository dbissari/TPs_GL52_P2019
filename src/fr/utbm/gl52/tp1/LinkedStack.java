/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * @author dbissari
 * @param <T>
 *
 */
public class LinkedStack<T> extends AbstractStack<T> {
	
	LinkedListElement<T> firstElement;
	private int size;

	public LinkedStack() {
		super();
		this.firstElement = null;
		this.size = 0;
	}

	@Override
	public void push(T element) {
		LinkedListElement<T> newElement = new LinkedListElement<>(element);
		newElement.setNextElement(this.firstElement);
		this.firstElement = newElement;
		this.size += 1;
	}

	@Override
	public T pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("No element to pop"); //$NON-NLS-1$
		}
		LinkedListElement<T> elementPopped = this.firstElement;
		this.firstElement = elementPopped.getNextElement();
		this.size -= 1;
		return elementPopped.getValue();
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public IStackIterator<T> iterator() {
		return new LinkedStackIterator();
	}

	/**
	 * @author dbissari
	 *
	 */
	public class LinkedStackIterator implements IStackIterator<T> {
		
		private LinkedListElement<T> currentElement = LinkedStack.this.firstElement;

		@Override
		public boolean hasNext() {
			return this.currentElement != null;
		}

		@Override
		public T next() throws Exception {
			if (!this.hasNext()) {
				throw new Exception("No next element"); //$NON-NLS-1$
			}
			LinkedListElement<T> toReturn = this.currentElement;
			this.currentElement = toReturn.getNextElement();
			return toReturn.getValue();
		}

	}

}
