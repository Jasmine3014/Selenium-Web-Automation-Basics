package com.jasmine.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class LocatorByTagName extends baseDriver {
	
	@BeforeClass
	public void openURL() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void locateByTagName()  {
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("Size: "+tags.size());
		System.out.println(tags);
	}
	

}


