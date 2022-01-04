package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Glucose {
	public String GlucoseCard="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='8']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='9']";
	public String addGlucose="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String GlucoseValueEnter="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String saveGlucose="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='8']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='9']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='10']";
	AppiumDriver<MobileElement> driver1;
	
	public Glucose(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
public void PositiveGlucoseVitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(GlucoseCard).click();
			
		
			TimeUnit.SECONDS.sleep(15);
			driver1.findElementByXPath(manualEntry).click();
			
		
		driver1.findElementByXPath(addGlucose).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(GlucoseValueEnter).click();
		driver1.findElementByXPath(GlucoseValueEnter).sendKeys("20");
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(saveGlucose).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		driver1.findElementByXPath(statusMonth).click();
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();

		
		
	}
}