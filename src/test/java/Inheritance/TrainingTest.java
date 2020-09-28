package Inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TrainingTest {

	
	@Test
	public void testInstantiateDefault()  {
	       Training t = new Training(1,"Java",1000);
	       assertEquals(1,t.getId());
	    }
	
	@Test
	public void testInstantiateDefault1()  {
	       Training t = new Training(1,"Java",1000);
	       assertEquals("Java",t.getSubject());
	    }
	
	@Test
	public void testInstantiateDefault2()  {
	       Training t = new Training(1,"Java",1000);
	       assertEquals(1000,t.getFees());
	    }
}
