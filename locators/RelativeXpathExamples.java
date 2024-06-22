package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class RelativeXpathExamples extends baseDriver{
	
//	@Test
	public void RelativeXpath () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Jasmine Tripti");
		Thread.sleep(5000);
				
	}
	 @Test
	public void xpathExamples2() {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		
		WebElement flashsale = driver.findElement(By.xpath("//*[@class='page regional_bd']/div[4]/div/h3"));
		System.out.println(flashsale.getText());
	}

}