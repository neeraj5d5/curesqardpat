package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Temp {
	public String TempCard="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='7']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='7']";
	public String addTemp="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String TempValueEnter="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String saveTemp="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";
	AppiumDriver<MobileElement> driver1;
	public Temp(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
public void PositiveTempVitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(TempCard).click();
			
		
			TimeUnit.SECONDS.sleep(15);
			driver1.findElementByXPath(manualEntry).click();
			
		
		driver1.findElementByXPath(addTemp).click();
		driver1.findElementByXPath(TempValueEnter).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(TempValueEnter).sendKeys("80");
		driver1.findElementByXPath(saveTemp).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		driver1.findElementByXPath(statusMonth).click();
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();

		
		
	}

}