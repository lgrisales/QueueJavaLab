
import java.util.Scanner;

import mycollections.EmptyQueueException;
import mycollections.MyQueue;
import mycollections.NullObjectException;


public class QueueMain {

	public static void main(String[] args) {


		MyQueue<String> queue = new MyQueue<String>();
		String data=null;
		Scanner myScanner = new Scanner(System.in); 
		String choice="y";
		 
		do {
			
			System.out.print("Please  enter the element want to add to the queue:");
			data=myScanner.nextLine();
			
			try {
				queue.enqueue(data);
			} catch (NullObjectException e) {
				System.out.print("The data cannot be null");
			}
			System.out.print("Do you want to enter more data? Please Y for yes and N for finish:");
			choice=myScanner.nextLine();

		}while(choice.equalsIgnoreCase("y"));
		String firstElement=null;
		try {
			firstElement = queue.peek();
		} catch (EmptyQueueException e) {
				e.printStackTrace();
		}
		System.out.println("The elements in the queue are:");
		for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.get(i));
			}
		System.out.println("The first element in the que is:"+firstElement);
		System.out.println("The size of the queue is:"+ queue.size());
		
	}

}
