/**
 * 
 */
package fr.utbm.gl52.tp1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dbissari
 *
 */
public class Test {

	/**
	 * @param args
	 */
	@SuppressWarnings("boxing")
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(
				Arrays.asList(
						new Integer[] {10, 150, 250 ,155 ,151, 451, 5514, 58, 84, 875, 965, 254, 233}));
		
		ArrayStack<Integer> myArrayStack = new ArrayStack<>();
		LinkedStack<Integer> myLinkedStack = new LinkedStack<>();
		
		list.forEach((Integer value)-> {
			myArrayStack.push(value);
			myLinkedStack.push(value);
		});
		
		while (!myArrayStack.isEmpty()) {
			try {
				System.out.println(
						String.format(
								"ArrayStack : Size %d : Element : %d", myArrayStack.size(), myArrayStack.pop())); //$NON-NLS-1$
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------------------"); //$NON-NLS-1$
		
		while (!myLinkedStack.isEmpty()) {
			try {
				System.out.println(
						String.format(
								"LinkedStack : Size %d : Element : %d", myLinkedStack.size(), myLinkedStack.pop())); //$NON-NLS-1$
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		IStackIterator<Integer> iterator = myArrayStack.iterator();
		while (iterator.hasNext()) {
			try {
				System.out.println(
						String.format(
								"ArrayStack : Element : %d", iterator.next())); //$NON-NLS-1$
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------------------"); //$NON-NLS-1$
		
		iterator = myLinkedStack.iterator();
		while (iterator.hasNext()) {
			try {
				System.out.println(
						String.format(
								"LinkedStack : Element : %d", iterator.next())); //$NON-NLS-1$
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
