package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByClass extends baseDriver {
	
	@BeforeSuite
	public void openurl() {
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
	}
	
	@Test
	public void locateById() throws InterruptedException {
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("jasmine");
		Thread.sleep(5000);
	}

}
