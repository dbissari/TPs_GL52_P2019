/**
 * 
 */
package fr.utbm.gl52.tp2;

import java.util.ArrayList;

/**
 * An abstract binary tree node class created to pool common behavior of binary tree nodes
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the node
 * @param <N> The type of the tree nodes
 */
public abstract class AbstractBinaryTreeNode<T, N extends AbstractBinaryTreeNode<T, N>> extends AbstractTreeNode<T, N> {

	protected N leftChild;
	
	protected N rightChild;

	/**
	 * Gets the left child node
	 * 
	 * @return The left child node
	 */
	public N getLeftChild() {
		return this.leftChild;
	}

	/**
	 * Sets the left child node
	 * 
	 * @param leftChild The new left child node
	 */
	public void setLeftChild(N leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Gets the right child node
	 * 
	 * @return The right child node
	 */
	public N getRightChild() {
		return this.rightChild;
	}

	/**
	 * Sets the right child node
	 * 
	 * @param rightChild The new right child node
	 */
	public void setRightChild(N rightChild) {
		this.rightChild = rightChild;
	}	

	@Override
	public ArrayList<N> getChildren() {
		ArrayList<N> children = new ArrayList<>();
		children.add(this.leftChild);
		children.add(this.rightChild);
		
		return children;
	}
}
