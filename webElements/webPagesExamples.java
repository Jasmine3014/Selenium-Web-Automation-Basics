package com.jasmine.webElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class webPagesExamples extends baseDriver {
	
	@Test
	public void webpagesExamples() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	    driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com']")).click();
		Thread.sleep(5000);
		driver.navigate().back();		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		

		
		

	
	}

}
