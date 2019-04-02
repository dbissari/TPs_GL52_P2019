/**
 * 
 */
package fr.utbm.gl52.tp2;

/**
 * An abstract tree class created to pool common behavior of trees
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the tree
 * @param <U> The type of node used in the tree
 */
public abstract class AbstractTree<T, U extends ITreeNode<T, U>> implements ITree<T, U> {
	
	private U root;
	
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
	
}
