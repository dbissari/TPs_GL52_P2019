/**
 * 
 */
package fr.utbm.gl52.tp2;

import java.util.ArrayList;

/**
 * An interface that every type of node should implement in our program
 * 
 * @author dbissari
 * @param <T> The type of the element which will be stored in the node
 * @param <U> The type of node used as children and parent
 */
public interface ITreeNode<T, U extends ITreeNode<T, U>> {
	
	/**
	 * Gets the children nodes
	 * 
	 * @return An {@link ArrayList} containing the node's children nodes
	 */
	public ArrayList<U> getChildren();
	
	/**
	 * Gets the parent node
	 * 
	 * @return The parent node
	 */
	public U getParent();
	
	/**
	 * Sets the parent node
	 * 
	 * @param parent The new parent node
	 */
	public void setParent(U parent);
	
	/**
	 * Gets the value of the node
	 * 
	 * @return The value of the node
	 */
	public T getValue();
	
	/**
	 * Sets the value of the node
	 * 
	 * @param value The new value of the node
	 */
	public void setValue(T value);
	
}
