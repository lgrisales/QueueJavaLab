/**
 * Lab4
 * Class:  MyQueueTest
 * Author: Lina M. Grisales
 * Date: November 28,2014
 */
package testcollections;

import java.text.SimpleDateFormat;
import java.util.Date;
import mycollections.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyQueueTest extends TestCase {

	MyQueue<Integer> queue;
	
	public static Test suite() { return new TestSuite(MyQueueTest.class);}
	public MyQueueTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Setting up MyQueue");

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Tearing down MyQueue");
		queue = null;
	}

	public void testConstructor() {
		queue = new MyQueue<Integer>();
		System.out.println("Testing constructor");
		assertNotNull("TestCase.testConstructors: MyQueue is null ", queue);

	}

	// -------------Testing Behaviors--------------------------------//
	
	public void testEnqueueForOneMillionElements() {
		queue = new MyQueue<Integer>();
		long startTime = System.currentTimeMillis();
		System.out.println("Testing enqueue'ing with 1 million elements");

		for (int i = 1; i <= 1000000; i++) {
			try {
				queue.enqueue(i);
			} catch (NullObjectException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The size of the queue is:" + queue.size());
		long totalTime = endTime - startTime;
		System.out.println("The duration of the test was:" + (totalTime/1000.0) +" seconds");

		assertEquals("\t\tTestCase:The size of the queue is not : 1000000",
				queue.size(), 1000000);
	}

	public void testEnqueueFor100000Elements() {
		queue = new MyQueue<Integer>();
		long startT = System.currentTimeMillis();
		System.out.println("Testing enqueue'ing with 100.000 elements");

		for (int i = 1; i <= 100000; i++) {
			try {
				queue.enqueue(i);
			} catch (NullObjectException e) {

				e.printStackTrace();
			}
		}

		long endT = System.currentTimeMillis();
		System.out.println("The size of the queue is:" + queue.size());
		long totalT = endT-startT ;
		SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
		Date resultD = new Date(totalT);
		System.out.println(df.format(resultD));
		System.out.println("The duration of the test was:" + totalT/1000.0+" seconds");

		assertTrue("\t\tTestCase:The size of the queue is not: 100000",queue.size() == 100000);

	}

	public void testEnqueueException() {
		MyQueue<String> queue = new MyQueue<String>();
		boolean error = false;
		String element = null;
		try {
			queue.enqueue(element);
			error = false;
		} catch (NullObjectException e) {
			error = true;

		}
		assertTrue("\t\tTestCase:method did not throw NullObjectException", error);
	}

	public void testDequeuingForOneMillionElements() {
		queue = new MyQueue<Integer>();
		System.out.println("Testing dequeue'ing 1 million elements");
		

		for (int i = 1; i <= 1000000; i++) {
			try {
				queue.enqueue(i);
			} catch (NullObjectException e) {
				e.printStackTrace();
			}
		}
		
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 1000000; i++) {
			try {
				queue.dequeue();
			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The duration of the test was:" + (totalTime/1000.0) +" seconds");
		assertTrue("\t\tTestCase:The queue is not empty", queue.isEmpty());
	}
	
	public void testDequeuingFor100000Elements() {
		queue = new MyQueue<Integer>();
		System.out.println("Testing dequeue'ing 100.000 elements");

		for (int i = 1; i <= 100000; i++) {
			try {
				queue.enqueue(i);
			} catch (NullObjectException e) {
				e.printStackTrace();
			}
		}
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			try {
				queue.dequeue();
			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The duration of the test was:" + (totalTime/1000.0) +" seconds");
		assertTrue("\t\tTestCase:The queue is not empty", queue.isEmpty());
	}
	
	public void peekTest(){
		queue = new MyQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		int frontElement=0;
		for (int i = 0; i <= queue.size(); i++) {
			try {
				frontElement=queue.peek();
				System.out.print(frontElement);  
			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
		}
		assertTrue("\t\tTestCase:The head element of the queue is not 10", frontElement == 10);
		
	}

}
