package Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Businessmodel.my_math;

public class MyMathTest {
	
	my_math m1;

	@Before
	public void setUp() throws Exception {
		m1=new my_math();
	}

	@After
	public void tearDown() throws Exception {
		m1=null;
	}


	@Test
	public void testSumWith3Numbers() {
		System.out.println("Test1 :");
		assertEquals(10, m1.sum(new int[] {5,3,2}));
	}
	
	@Test
	public void testSumWith1Number() {
		System.out.println("Test1 :");
		assertEquals(5, m1.sum(new int[] {5}));
	}

}