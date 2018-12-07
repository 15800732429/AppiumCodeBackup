package com.app.appium;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	
	public void homepage() throws MalformedURLException, InterruptedException{
		AppiumDriver driver = SetUp.driver();
		
		driver.findElementByXPath("//*[@text='选车去比价' and @class='android.widget.TextView']").click();
		Thread.sleep(5000);
		
	}
	

}
