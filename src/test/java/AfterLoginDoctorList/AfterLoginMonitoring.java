package AfterLoginDoctorList;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AfterLoginMonitoring {
	public String monitoringTab="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='2']";
	public AfterLoginMonitoring(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			monitoringTest(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void monitoringTest(AppiumDriver<MobileElement> driver) {
		
		driver.findElementByXPath(monitoringTab).click();
		System.out.println("Cause is :monitoringTest");
		
	}

}