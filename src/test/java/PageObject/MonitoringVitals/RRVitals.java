package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RRVitals {
	public String RRCard="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='10']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='5']";
	public String addRR="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String RRValueEnter="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String saveRR="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";
	public String backButton="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	AppiumDriver<MobileElement> driver1;
	
	public RRVitals(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
public void PositiveRRVitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(RRCard).click();
			
		
		
			TimeUnit.SECONDS.sleep(2);
			
		
		driver1.findElementByXPath(addRR).click();
		driver1.findElementByXPath(RRValueEnter).click();
		driver1.findElementByXPath(RRValueEnter).sendKeys("10");
		driver1.findElementByXPath(addRR).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		driver1.findElementByXPath(statusMonth).click();
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();
		driver1.findElementByXPath(backButton).click();

		
		
	}

}