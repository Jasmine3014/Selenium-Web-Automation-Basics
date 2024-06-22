package com.jasmine.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByLinkText extends baseDriver {
	
	@BeforeSuite
	public void openurl() {
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
	}
	
	@Test
	public void locateByPartialLink() throws InterruptedException {
		WebElement Forget_password = driver.findElement(By.partialLinkText("Forgotten"));
		Forget_password.click();
		Thread.sleep(5000);
	}

}
