package com.jasmine.assertion;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class HardAssertion extends baseDriver {
   
    @BeforeSuite
	 public void openURL() throws InterruptedException{
		 
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);

		}
     
	 @Test
	 
	 public void hardAssertion() {
		 String expectedTitle="Selenium - Automation Practice Form";
		 String actualTitle= driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
		 System.out.println("Tiltle:"+actualTitle);
		 
	 }
     
     
}
