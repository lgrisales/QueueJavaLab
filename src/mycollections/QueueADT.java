/**
 * Lab4
 * Interface: QueueADT<E>
 * Author: Lina M. Grisales
 * Date: November 28,2014
 */

package mycollections;
import java.util.Iterator;


public interface QueueADT<E> {
	
	public boolean enqueue(E element) throws NullObjectException;
	public E peek()throws EmptyQueueException;
	public E dequeue()throws EmptyQueueException;
	public int size();
	public void clear();
	public Iterator<E> iterator();
	public boolean remove(Object element);
	public boolean  contains(Object element);
	

}
