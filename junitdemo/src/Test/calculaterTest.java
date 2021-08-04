package Test;

import static org.junit.jupiter.api.Assertions.*;
import Businessmodel.calculater;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class calculaterTest {
	private  calculater calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc=new calculater();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		calc=null;
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
		double result=calc.add(10.50, 10.3);
		assertEquals(30.82,result,0);
	}

	@Test
	void testSubtract() {
		fail("Not yet implemented");
		double result=calc.subtract(100.5, 95);
		assertEquals(4.5,result,0);
	}

	@Test
	void testMultiply() {
		fail("Not yet implemented");
		double result=calc.multiply(100, 2.5);
		assertEquals(250,result,0);
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
		double result=calc.divide(100, 10);
		assertEquals(10,result);
	}

}
