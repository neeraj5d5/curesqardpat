package HealthRecord;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class searchFile {
	public String searchfile="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";

	AppiumDriver<MobileElement> driver1;
	public searchFile(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	public void PositiveHealthRecordUpload() {
		driver1.findElementByXPath(searchfile).click();
		driver1.findElementByXPath(searchfile).sendKeys("record");

		
		
		
		

	}
}