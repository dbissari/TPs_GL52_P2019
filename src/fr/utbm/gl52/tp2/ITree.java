/**
 * 
 */
package fr.utbm.gl52.tp2;

/**
 * An interface that every type of tree should implement in our program
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the tree
 * @param <U> The type of node used in the tree
 */
public interface ITree<T, U extends ITreeNode<T, U>> {

	/**
	 * Gets the tree root
	 * 
	 * @return The tree root node
	 */
	public U getRoot();
	
	/**
	 * Sets the tree root
	 * 
	 * @param root The new root node
	 */
	public void setRoot(U root);
	
	/**
	 * Calculate the height of the tree
	 * 
	 * @return The height of the tree
	 */
	public int getHeight();
	
	/**
	 * Calculate the number of nodes in the tree
	 * 
	 * @return The size of the tree
	 */
	public int getSize();
	
}
