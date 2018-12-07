package com.app.appium;

import java.net.MalformedURLException;

public class MainAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		HomePage homepage = new HomePage();
		homepage.homepage();
		
		CarBrandAoDi carbrandaodi = new CarBrandAoDi();
		carbrandaodi.carbrandaodi();
		

	}

}
