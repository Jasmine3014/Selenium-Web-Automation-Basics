package com.jasmine.keyboaedEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class copyAndpaste extends baseDriver {
	
	@BeforeSuite
	public void openUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
	}
	
	@Test
	public void copy_paste() throws InterruptedException {
		Actions action = new Actions (driver);
		WebElement f_name = driver.findElement(By.xpath("//input[@id='firstname']"));
		f_name.sendKeys("jasmine");
		
		//copy ctrl+A
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(1000);
		//TAB
		

		action.keyDown("UserName");
		action.build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(1000);
		
	}
	

}
