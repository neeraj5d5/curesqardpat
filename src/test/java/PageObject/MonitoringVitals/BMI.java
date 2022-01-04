package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BMI {
	public String BMICard="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='9']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='5']";
	public String addBMI="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String BMIValueEnter="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String saveBMI="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";
	AppiumDriver<MobileElement> driver1;
	
	public BMI(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
public void PositiveBMIVitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(BMICard).click();
		
			
			
			TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(addBMI).click();
		driver1.findElementByXPath(BMIValueEnter).click();
		driver1.findElementByXPath(BMIValueEnter).sendKeys("50");
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(saveBMI).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		driver1.findElementByXPath(statusMonth).click();
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();

		
		
	}
}