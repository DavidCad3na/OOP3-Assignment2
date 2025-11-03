package utilities;
/**
 * Created By: James on 2025-11-03
 * Basic Stack Abstract Data Type interface.
 * Stacks are LIFO (last in, first out) data structures.
 * They are primarily used when you need to reverse the order of elements
 * 
 * @param <E> The type of elements this stack holds.
 */
public interface StackADT<E> {

	/** Stack Push
	 * Precondition: toPush is not null
	 * Postcondition: toPush is added to the top of the stack
	 * @Param: toPush The element to be pushed onto the stack
	 * @Returns: nothing
	 */
	public void push(E toPush);
	
	/** Stack Pop
	 * Precondition: stack is not empty
	 * Postcondition: the element that was last entered into the list is removed from the stack
	 * @Param: none
	 * @Returns: the element that was removed from the stack
	 */
	public E pop();
	/** Stack Peek
	 * Precondition: stack is not empty
	 * Postcondition: The element that was last entered is returned but not removed from the stack
	 * @Param: none
	 * @Returns: the element that was last entered into the stack
	 */
	public E peek();
	/** Stack Size
	 *  Precondition: none
	 *  Postcondition: none
	 *  @Param: none
	 *  @Returns: the number of elements currently in the stack
	 */
	public int size();
	/** Stack isEmpty
	 * Precondition: none
	 * Postcondition: none
	 * @Param: none
	 * @Returns: true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();
}
