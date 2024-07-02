package com.jasmine.mouseHover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class mouseHover extends baseDriver {
	
	@BeforeSuite
	public void openUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	
	public void mousehover() throws InterruptedException{
		Actions action = new Actions(driver);
		
		WebElement tv_homeAlince = driver.findElement(By.xpath("//span[contains(text(),'TV & Home Appliances')]"));
		action.moveToElement(tv_homeAlince).perform();
		Thread.sleep(5000);
		
		
		WebElement Television = driver.findElement(By.xpath("//ul[@class='lzd-site-menu-root']/ul[7]/li[1]/a/span"));
		action.moveToElement(Television).perform();
		Thread.sleep(5000);
		
		WebElement oled_televisions = driver.findElement(By.xpath("//span[contains(text(),'OLED Televisions')]"));
		oled_televisions.click();
		Thread.sleep(5000);

		
		
		
	}

}
