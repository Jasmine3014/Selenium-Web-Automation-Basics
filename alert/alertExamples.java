package com.jasmine.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jasmine.baseDriver;

public class alertExamples extends baseDriver{
	/*
	public void alertexamples1() throws InterruptedException {
		
		driver.manage().window().maximize();	
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement First_alert = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
		First_alert.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		
	}*/
	
	/*
	@Test
	public void alertexamples2() throws InterruptedException {
		
		driver.manage().window().maximize();	
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");


		WebElement element = driver.findElement(By.xpath("// button[contains(text(),'Click Me') and @onclick='myDesk()']"));
		element.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	*/
	@Test
	public void alertexamples3() throws InterruptedException {
		
		driver.manage().window().maximize();	
		driver.get("https://demoqa.com/alerts");


		WebElement element = driver.findElement(By.xpath("//button[@id='promtButton']"));
		element.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("hello");
		alert.accept();
		Thread.sleep(5000);
		
		
	}
	
	

}
