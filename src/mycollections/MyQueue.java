/**
 * Lab4
 * Class: MyQueue<E>
 * Author: Lina M. Grisales
 * Date: November 28,2014
 */

package mycollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MyQueue<E> extends ArrayList<E> implements QueueADT<E>,Iterable<E>{
	
	public MyQueue(){
		
	}
	/**
	 *  Adds the specified element to this queue.
	 *  return true if element was added
	 */
	@Override
	public boolean enqueue(E element) throws NullObjectException {
		if(element==null){
			throw new NullObjectException("Not element to be added ");
		}
		add(element);			
		return true;
	}
	
	/**
	 * Retrieves the head element of the queue, but does not remove it
	 * return an E element 
	 */
	@Override
	public E peek() throws EmptyQueueException{
		if(isEmpty()){
			throw new EmptyQueueException("Empty queue"); 
		}
		return get(0);
	}
	/**
	 * Retrieves and removes the head of this queue
	 * return an E element 
	 */
	@Override
	public E dequeue() throws EmptyQueueException{
		E element=peek();
		remove(0);
		return element;
	}
	/**
	 * Returns the number of elements in this collection.
	 */
	@Override
	public int size(){
		return super.size();
	}
	/**
	 * Remove all elements from the queue.
	 */
	@Override
	public void clear(){
		super.clear();
	}
	
	/**
	 * Returns an iterator over the elements in this queue.
	 */
	@Override
	public Iterator<E> iterator (){
		return super.iterator();
	}
	/**
	 * Removes a single instance of the specified element 
	 * from the collection, if it is present.
	 */
	public boolean remove(Object element){
		return super.remove(element);
	}
	/**
	 * Returns true if object "element" is present in the queue	 
	 */
	public boolean contains(Object element){
		 return super.contains(element);
	}
	
}
