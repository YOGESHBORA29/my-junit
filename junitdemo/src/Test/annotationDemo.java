

	package Test;

	import static org.junit.Assert.*;

	import java.util.ArrayList;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
import org.junit.Test;

	public class annotationDemo {
		
		private ArrayList<String> list;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			System.out.println("Using @BeforeClass , executed before all test cases ");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			System.out.println("Using @AfterClass ,executed after all test cases");
		}

		@Before
		public void setUp() throws Exception {
			list = new ArrayList<String>();
			System.out.println("Using @Before annotations ,executed before each test cases ");
		}

		@After
		public void tearDown() throws Exception {
			list.clear();
			System.out.println("Using @After ,executed after each test cases");   
		}

		@Test
		public void test() {
			list.add("Junit");
			assertFalse(list.isEmpty());
			assertEquals(1, list.size());
			System.out.println("In Test Method");
		}
		
		@Test
		public void test2() {
			list.add("Junit");
			assertFalse(list.isEmpty());
			assertEquals(1, list.size());
			System.out.println("In Test Method");
		}

	}