/**
 * 
 */
package fr.utbm.gl52.tp2;

import java.util.Iterator;

/**
 * An abstract binary tree class created to pool common behavior of binary trees
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the tree
 * @param <N> The type of the tree nodes
 */
public abstract class AbstractBinaryTree<T, N extends AbstractBinaryTreeNode<T, N>> extends AbstractTree<T, N> {
	
	public Iterator<T> infixeIterator() {
		return new InfixeIterator(this.root);
	}

	public class InfixeIterator implements Iterator<T> {
		
		N next;
		
		public InfixeIterator(N root) {
			this.next = root;
			while (this.next.getLeftChild() != null) {
				this.next = this.next.getLeftChild();
			}
		}

		@Override
		public boolean hasNext() {
			return this.next != null;
		}

		@Override
		public T next() {
			N element = this.next;
			
			return element.getValue();
		}

	}
}
