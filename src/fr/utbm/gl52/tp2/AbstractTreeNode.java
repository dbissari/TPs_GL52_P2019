/**
 * 
 */
package fr.utbm.gl52.tp2;

/**
 * An abstract tree node class created to pool common behavior of tree nodes
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the node
 * @param <U> The type of node used as children and parent
 */
public abstract class AbstractTreeNode<T, U extends ITreeNode<T, U>> implements ITreeNode<T, U> {
	
	private U parent;

	private T value;

	@Override
	public T getValue() {
		return this.value;
	}

	@Override
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public U getParent() {
		return this.parent;
	}
	
	@Override
	public void setParent(U parent) {
		this.parent = parent;
	}
	
}
