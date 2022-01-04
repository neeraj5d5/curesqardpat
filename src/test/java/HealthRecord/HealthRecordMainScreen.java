package HealthRecord;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HealthRecordMainScreen {
	public String healthRecordTab="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";
	
	AppiumDriver<MobileElement> driver1;
	public HealthRecordMainScreen(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	public void PositiveHealthRecordMainScreen() throws InterruptedException {
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(healthRecordTab).click();
			
			
		
		
	}
	}