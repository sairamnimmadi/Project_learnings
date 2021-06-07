/*
 * 
 * TDD using JUNIT 2 Methods to test the String
 * 
 * 
 */


package learnmaven;

import org.junit.Assert;
import org.junit.Test;

public class TestGreeting {
	
	Greeting greeting = new Greeting();
	
	@Test
	public void testingValidinput(){

		Assert.assertEquals("Hello world", greeting.getMessage());
	}
	
	@Test
	public void testingInvalidinput(){
	
		Assert.assertNotSame("world", greeting.getMessage());
	}
	
	
}