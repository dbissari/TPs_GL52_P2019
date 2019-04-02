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
 */
public abstract class AbstractBinaryTreeNode<T> extends AbstractTreeNode<T, AbstractBinaryTreeNode<T>> {

	private AbstractBinaryTreeNode<T> leftChild;
	
	private AbstractBinaryTreeNode<T> rightChild;

	/**
	 * Gets the left child node
	 * 
	 * @return The left child node
	 */
	public AbstractBinaryTreeNode<T> getLeftChild() {
		return this.leftChild;
	}

	/**
	 * Sets the left child node
	 * 
	 * @param leftChild The new left child node
	 */
	public void setLeftChild(AbstractBinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Gets the right child node
	 * 
	 * @return The right child node
	 */
	public AbstractBinaryTreeNode<T> getRightChild() {
		return this.rightChild;
	}

	/**
	 * Sets the right child node
	 * 
	 * @param rightChild The new right child node
	 */
	public void setRightChild(AbstractBinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}	
	
	@Override
	public ArrayList<AbstractBinaryTreeNode<T>> getChildren() {
		ArrayList<AbstractBinaryTreeNode<T>> children = new ArrayList<>();
		children.add(this.leftChild);
		children.add(this.rightChild);
		
		return children;
	}
	
}
