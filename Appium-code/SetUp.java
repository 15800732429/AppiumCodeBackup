package com.app.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class SetUp {
	//定义driver
	private AppiumDriver driver;
	public static AppiumDriver driver() throws MalformedURLException, InterruptedException{
		
		//下面5行代码是固定胡语法格式
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName","da6a884");
		capabilities.setCapability("platformVersion", "6.0.1");
		
		//包名和activity名
        capabilities.setCapability("appPackage", "com.haomaiche.app_android_buyer_v5");  
        capabilities.setCapability("appActivity", "com.haomaiche.app_android_buyer_v5.MainActivity");
      //不重置数据
        capabilities.setCapability("noReset", true);
      //隐藏手机中的软键盘,让手机中可以输入中文
        capabilities.setCapability("unicodeKeyboard",true);
        capabilities.setCapability("resetKeyboard",true);
        
        capabilities.setCapability("appWaitActivity", "com.haomaiche.app_android_buyer_v5.MainActivity");
        capabilities.setCapability("sessionOverride",true);
        
      //这个127的地址就是appium server的地址  
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        Thread.sleep(5000);
        System.out.println("测试");
      //停顿5秒钟
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        System.out.println("App安装运行成功！");
        
        return driver;
        
		
	}

}
