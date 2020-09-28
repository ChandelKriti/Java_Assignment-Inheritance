package Inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CorporateTrainingTest {

	
	@Test
	public void testInstantiateDefault()  {
	       CorporateTraining ct = new CorporateTraining(1,"Java",1000,4);
	       assertEquals(4,ct.getDays());
	    }
	
	@Test
	public void testInstantiateDefault1()  {
	       CorporateTraining ct = new CorporateTraining(1,"Java",1000,4);
	       assertEquals(1,ct.getId());
	    }
	
	@Test
	public void testInstantiateDefault2()  {
	       CorporateTraining ct = new CorporateTraining(1,"Java",1000,4);
	       assertEquals("Java",ct.getSubject());
	    }
	
	@Test
	public void testInstantiateDefault3()  {
	       CorporateTraining ct = new CorporateTraining(1,"Java",1000,4);
	       assertEquals(1000,ct.getFees());
	    }
	
	@Test
    public void testCorporateTraining() {
		
		CorporateTraining corporateTraining = new CorporateTraining(1,"BigData",35000,4);
		int expectedOutput = 140000;
		int methodOutput = corporateTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testCorporateTraining1() {
		
		CorporateTraining corporateTraining = new CorporateTraining(2,"Machine Learning",45000,9);
		int expectedOutput = 405000;
		int methodOutput = corporateTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testCorporateTraining2() {
		
		CorporateTraining corporateTraining = new CorporateTraining(3,"Artificial Intelligence",55000,15);
		int expectedOutput = 825000;
		int methodOutput = corporateTraining.getOrderValue();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
}
