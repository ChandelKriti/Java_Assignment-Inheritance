package Inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class PublicTrainingTest {

	
	@Test
	public void testInstantiateDefault()  {
	       PublicTraining pt = new PublicTraining(1,"Java",1000,10);
	       assertEquals(10,pt.getParticipants());
	    }
	
	@Test
	public void testInstantiateDefault1()  {
		PublicTraining pt = new PublicTraining(1,"Java",1000,10);
	       assertEquals(1,pt.getId());
	    }
	
	@Test
	public void testInstantiateDefault2()  {
		PublicTraining pt = new PublicTraining(1,"Java",1000,10);
	       assertEquals("Java",pt.getSubject());
	    }
	
	@Test
	public void testInstantiateDefault3()  {
		PublicTraining pt = new PublicTraining(1,"Java",1000,10);
	       assertEquals(1000,pt.getFees());
	    }
	
	@Test
    public void testPublicTraining() {
		
		PublicTraining publicTraining = new PublicTraining(1,"Java",5000,50);
		int expectedOutput = 250000;
		int methodOutput = publicTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testPublicTraining1() {
		
		PublicTraining publicTraining = new PublicTraining(2,"Javascript",4000,40);
		int expectedOutput = 160000;
		int methodOutput = publicTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testPublicTraining2() {
		
		PublicTraining publicTraining = new PublicTraining(3,"React",6000,70);
		int expectedOutput = 420000;
		int methodOutput = publicTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
