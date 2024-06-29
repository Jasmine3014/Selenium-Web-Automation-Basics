package com.jasmine.tabWindow;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class newTab extends baseDriver {
    @BeforeSuite
	 public void openURL() throws InterruptedException{
		 
		 driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);

		}
    @Test
    public void Tab() throws InterruptedException {
    	String parentTab = driver.getWindowHandle();
    	//create new tab
    	driver.switchTo().newWindow(WindowType.TAB);
    	String second_child = driver.getWindowHandle();
    	driver.get("https://www.daraz.com.bd/");
    	 Thread.sleep(5000);
    	 
    	 //switching tab
    	Set<String> alltabs = driver.getWindowHandles();
    	System.out.println("Number of Tab: "+alltabs.size());
    	
    	driver.switchTo().window(parentTab); 
    	Thread.sleep(5000);
    	driver.switchTo().window(second_child); 
    	Thread.sleep(5000);
    	
    }
}
