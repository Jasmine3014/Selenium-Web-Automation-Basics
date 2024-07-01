package com.jasmine.assertion;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jasmine.baseDriver;

public class SoftAssertion extends baseDriver {
   
    @BeforeSuite
	 public void openURL() throws InterruptedException{
		 
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);

		}
     
	 @Test
	 
	 public void softAssertion() {
		 
		 SoftAssert softassert = new SoftAssert();
		 String expectedTitle="Selenium - Automation Practice Form";
		 String actualTitle= driver.getTitle();
		 softassert.assertEquals(actualTitle, expectedTitle);
		 System.out.println("Tiltle:"+actualTitle);
		 
		 softassert.assertAll();
		 
		 
	 }
     
     
}
