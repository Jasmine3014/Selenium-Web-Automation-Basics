package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByCssSelector extends baseDriver {
	
	@BeforeSuite
	public void openurl() {
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	public void locateByCssSelector() throws InterruptedException {
		WebElement signup = driver.findElement(By.cssSelector("a.grey.bld-txt.overlay"));
		signup.click();
		Thread.sleep(5000);
	}

}
