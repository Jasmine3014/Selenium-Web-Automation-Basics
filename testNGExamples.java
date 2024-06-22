package com.jasmine;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class testNGExamples {

@BeforeSuite
public void beforeSuiteClass() {
		
		System.out.println("Before suite classs");
}
		
		@Test
		public void testClass() {
			
			System.out.println("Test suite classs");
		}

	
	@AfterSuite
	public void aftersuiteClass() {
		
		System.out.println("After suite classs");
	}
	
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After classs");
	}
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("Bef0re classs");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("Bef0re Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("Bef0re Method");
	}


}
