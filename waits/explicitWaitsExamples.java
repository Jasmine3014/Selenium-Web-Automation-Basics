package com.jasmine.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class explicitWaitsExamples extends baseDriver {
	
    @BeforeSuite
	 public void openURL() throws InterruptedException{
		 
		 driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);

		}
    @Test
    public void explicitWait() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
    	WebElement first_name = driver.findElement(By.id("firstname"));
    	first_name.sendKeys("tripti");
    	Thread.sleep(2000);
    }
     

}
