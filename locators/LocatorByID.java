package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByID extends baseDriver {
   
	@BeforeSuite
	public void openurl() {
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	public void locateByClassName() throws InterruptedException {
		WebElement button = driver.findElement(By.className("bld-txt"));
		button.click();
		Thread.sleep(5000);
	}
}
