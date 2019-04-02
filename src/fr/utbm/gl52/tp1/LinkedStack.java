/**
 * 
 */
package fr.utbm.gl52.tp1;

/**
 * extends {@link AbstractStack}
 * A stack implemented with a linked list using {@link LinkedListElement}
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the array stack
 */
public class LinkedStack<T> extends AbstractStack<T> {
	
	private LinkedListElement<T> firstElement;
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
	public int size() {
		return this.size;
	}

	@Override
	public IStackIterator<T> iterator() {
		return new LinkedStackIterator();
	}

	/**
	 * implements {@link IStackIterator}
	 * An iterator to loop over an {@link LinkedStack} elements
	 * 
	 * @author dbissari
	 */
	@SuppressWarnings("synthetic-access")
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
