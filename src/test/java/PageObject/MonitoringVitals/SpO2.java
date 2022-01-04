package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SpO2 {
	public String SpO2Card="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='5']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='9']";
	public String addBPVital="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String SPO2Value="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String saveVitals="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";
	

	AppiumDriver<MobileElement> driver1;
	public SpO2(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	
	public void PositiveSpo2Vitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(SpO2Card).click();
			
		
			TimeUnit.SECONDS.sleep(15);
			driver1.findElementByXPath(manualEntry).click();
		
		driver1.findElementByXPath(addBPVital).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(SPO2Value).click();
		driver1.findElementByXPath(SPO2Value).sendKeys("80");
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(saveVitals).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		driver1.findElementByXPath(statusMonth).click();
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();
		System.out.println("Cause is :PositiveSpo2Vitals");
		
		
	}

}