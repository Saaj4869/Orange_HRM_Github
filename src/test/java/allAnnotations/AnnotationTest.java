package allAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	void S1()
	{
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	void S2()
	{
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	void BT()
	{
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("This is After Test");
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	void afterMethod() 
	{
		System.out.println("This is After Method");
	}

	@Test (priority = 1)
	void testMethod1()
	{
		System.out.println("This is the Test Method 1");
	}
	
	@Test (priority = 2)
	void testMethod2()
	{
		System.out.println("This is the Test Method 2");
	}
}
