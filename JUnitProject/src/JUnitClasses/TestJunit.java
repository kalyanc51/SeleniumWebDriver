package JUnitClasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	
	@Test()
	   public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	      System.out.println("This is a set up method.");
	   }

}
