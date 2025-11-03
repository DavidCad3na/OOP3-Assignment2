package utilities;
/** 
 * Created By: James on 2025-11-03
 *  Basic Queue Abstract Data Type interface.
 *  Queues are FIFO (first in, first out) data structures.
 *  They are used when you need to maintain the order of elements in the array.
 *  Additionally when you need to process elements of the array in the order they arrive.
 */
public interface QueueADT<E> {
	/** Queue Enqueue
	 * Precondition: toEnqueue is not null
	 * Postcondition: toEnqueue is added to the back of the queue
	 * @Param: toEnqueue The element to be added to the queue
	 * @Returns: nothing
	 */
	public void enqueue(E toEnqueue);
	/** Queue Dequeue
	 * Precondition: queue is not empty
	 * Postcondition: the element that was first entered into the queue is removed from the queue
	 * @Param: none
	 * @Returns: the element that was removed from the queue
	 */
	public E dequeue();
	/** Queue Peek
	 * Precondition: queue is not empty
	 * Postcondition: The element that was first entered is returned but not removed from the queue
	 * @Param: none
	 * @Returns: the element that was first entered into the queue
	 */
	public E peek();
	/** Queue Size
	 * Precondition: none
	 * Postcondition: none
	 * @Param: none
	 * @Returns: the number of elements currently in the queue
	 */
	public int size();
	/** Queue isEmpty
	 * Precondition: none
	 * Postcondition: none
	 * @Param: none
	 * @Returns: true if the queue is empty, false otherwise
	 */
	public boolean isEmpty();
}
