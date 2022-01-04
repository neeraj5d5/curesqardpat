package HealthRecord;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class healthRecordTabWork {
	public String Forms="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";
	public String labReports="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='4']";
	public String Erx="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='5']";
	public String DoctorsReports="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='6']";

	AppiumDriver<MobileElement> driver1;
	public healthRecordTabWork(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	public void PositiveHealthRecordMainScreen() {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(labReports).click();
			driver1.findElementByXPath(Erx).click();
			driver1.findElementByXPath(DoctorsReports).click();
			driver1.findElementByXPath(Forms).click();
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
		
	}
}