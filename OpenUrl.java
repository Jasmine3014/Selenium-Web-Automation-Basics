package com.jasmine;

import org.testng.annotations.Test;

public class OpenUrl extends baseDriver {
	
     @Test	
     public void openurl() throws InterruptedException  {
    	 driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.10.2");
    	Thread.sleep(5000);
     }
}
