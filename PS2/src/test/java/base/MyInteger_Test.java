package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
		static MyInteger var = new MyInteger(28);
		static MyInteger var1 = new MyInteger(12);
		static MyInteger var2 = new MyInteger(5);
		static MyInteger var3 = new MyInteger(9);
		
		@Test
		public void testIsEven() {
			boolean expectedResult0 = true;
			boolean actualResult0 = var.isEven();
			assertEquals(expectedResult0,actualResult0);
			boolean expectedResult1 = true;
			boolean actualResult1 = var1.isEven();
			assertEquals(expectedResult1,actualResult1);
			boolean expectedResult2 = false;
			boolean actualResult2 = var2.isEven();
			assertEquals(expectedResult2,actualResult2);
			boolean expectedResult3 = false;
			boolean actualResult3 = var3.isEven();
			assertEquals(expectedResult3,actualResult3);
		}
		

	public static void setUpBeforeClass1() throws Exception{
		}
		static MyInteger num = new MyInteger(1);
		static MyInteger num1 = new MyInteger(2);
		static MyInteger num2 = new MyInteger(3);
		static MyInteger num3 = new MyInteger(4);	
	
		@Test
		public void testIsOdd() {
			boolean expectedResult0 = true;
			boolean actualResult0 = num.isOdd();
			assertEquals(expectedResult0,actualResult0);
			boolean expectedResult1 = false;
			boolean actualResult1 = num1.isOdd();
			assertEquals(expectedResult1,actualResult1);
			boolean expectedResult2 = true;
			boolean actualResult2 = num2.isOdd();
			assertEquals(expectedResult2,actualResult2);
			boolean expectedResult3 = false;
			boolean actualResult3 = num3.isOdd();
			assertEquals(expectedResult3,actualResult3);
			
		}
		@Test
	public void isPrime(){
		MyInteger a = new MyInteger(2);
		MyInteger b = new MyInteger(3);
		MyInteger c = new MyInteger(4);
		MyInteger d = new MyInteger(5);
		assertTrue(a.isPrime());
		assertTrue(MyInteger.isPrime(b));
		assertFalse(MyInteger.isPrime(c));
		assertTrue(MyInteger.isPrime(d));
		
		}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
}

	


