/**
 * Lab4
 * Class:  AllTests
 * Author: Lina M. Grisales
 * Date: November 28,2014
 */
package testcollections;
import junit.framework.*;


public class AllTests extends TestCase {

	public AllTests(String name) { super(name);		}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(MyQueueTest.suite());
		return suite;
	}
	
	public static void main(String[] args) {
			 System.out.println("Executing AllTests ...");
		       junit.textui.TestRunner.run(suite());

	}

}
