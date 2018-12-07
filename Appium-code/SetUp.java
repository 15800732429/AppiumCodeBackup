package com.app.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class SetUp {
	//����driver
	private AppiumDriver driver;
	public static AppiumDriver driver() throws MalformedURLException, InterruptedException{
		
		//����5�д����ǹ̶����﷨��ʽ
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName","da6a884");
		capabilities.setCapability("platformVersion", "6.0.1");
		
		//������activity��
        capabilities.setCapability("appPackage", "com.haomaiche.app_android_buyer_v5");  
        capabilities.setCapability("appActivity", "com.haomaiche.app_android_buyer_v5.MainActivity");
      //����������
        capabilities.setCapability("noReset", true);
      //�����ֻ��е������,���ֻ��п�����������
        capabilities.setCapability("unicodeKeyboard",true);
        capabilities.setCapability("resetKeyboard",true);
        
        capabilities.setCapability("appWaitActivity", "com.haomaiche.app_android_buyer_v5.MainActivity");
        capabilities.setCapability("sessionOverride",true);
        
      //���127�ĵ�ַ����appium server�ĵ�ַ  
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        Thread.sleep(5000);
        System.out.println("����");
      //ͣ��5����
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        System.out.println("App��װ���гɹ���");
        
        return driver;
        
		
	}

}
