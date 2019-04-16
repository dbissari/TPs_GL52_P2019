/**
 * 
 */
package fr.utbm.gl52.tp2;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * An abstract tree class created to pool common behavior of trees
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the tree
 * @param <U> The type of node used in the tree
 */
public abstract class AbstractTree<T, U extends ITreeNode<T, U>> implements ITree<T, U>, Iterable<T> {
	
	protected U root;
	
	@Override
	public U getRoot() {
		return this.root;
	}
	
	@Override
	public void setRoot(U root) {
		this.root = root;
	}

	@Override
	public int getHeight() {
		// TODO Implement method
		return 0;
	}

	@Override
	public int getSize() {
		// TODO Implement method
		return 0;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new BFSIterator(this.root);
	}
	
	public Iterator<T> dfsIterator() {
		return new DFSIterator(this.root);
	}
	
	public class BFSIterator implements Iterator<T> {
		
		LinkedList<U> toVisit = new LinkedList<>();
		
		public BFSIterator(U root) {
			this.toVisit.add(root);
		}

		@Override
		public boolean hasNext() {
			return !this.toVisit.isEmpty();
		}

		@Override
		public T next() {
			U element = this.toVisit.poll();
			this.toVisit.addAll(element.getChildren());
			return element.getValue();
		}

	}
	
	public class DFSIterator implements Iterator<T> {
		
		LinkedList<U> toVisit = new LinkedList<>();
		
		public DFSIterator(U root) {
			this.toVisit.add(root);
		}

		@Override
		public boolean hasNext() {
			return !this.toVisit.isEmpty();
		}

		@Override
		public T next() {
			U element = this.toVisit.pop();
			this.toVisit.addAll(element.getChildren());
			return element.getValue();
		}

	}
	
}
