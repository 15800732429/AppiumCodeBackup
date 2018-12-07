package com.app.appium;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

public class CarBrandAoDi {
	public void carbrandaodi() throws MalformedURLException, InterruptedException{
		AppiumDriver driver = SetUp.driver();
		driver.findElementByXPath("//*[@text='°ÂµÏ']").click();
	}

}
