package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByName extends baseDriver {
	
	@BeforeSuite
	public void openurl() {
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	public void locateByClass() throws InterruptedException {
		WebElement name = driver.findElement(By.Class("email"));
		name.sendKeys("jasmine");
		Thread.sleep(5000);
	}

}
