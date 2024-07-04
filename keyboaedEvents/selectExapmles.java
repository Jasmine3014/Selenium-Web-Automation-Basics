package com.jasmine.keyboaedEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class selectExapmles extends baseDriver{
	
	@BeforeSuite
	public void openUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
	
	@Test
	public void selectExamples() throws InterruptedException {
		WebElement State_and_City = driver.findElement(By.id("state"));
		Select select = new Select (State_and_City);
		
		//select by index
		select.selectByIndex(2);
		Thread.sleep(3000);
		
		//select by value
		select.selectByValue("NCR");
        Thread.sleep(3000);
        
		//select by Visibletext
		select.selectByVisibleText("Haryana");
		Thread.sleep(3000);
	}
	

}
