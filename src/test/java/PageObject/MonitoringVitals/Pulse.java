package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Pulse {
	public String PulseCard="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='6']";
	public String manualEntry="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='7']";
	public String addPulse="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String pulseValueEnter="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='7']";
	public String savePulse="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String statusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String statusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String statusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";

	AppiumDriver<MobileElement> driver1;
	public Pulse(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
public void PositivePulseVitals() throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(PulseCard).click();
			
		
			TimeUnit.SECONDS.sleep(15);
			driver1.findElementByXPath(manualEntry).click();
			
		
		driver1.findElementByXPath(addPulse).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(pulseValueEnter).click();
		driver1.findElementByXPath(pulseValueEnter).sendKeys("80");
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(savePulse).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusWeek).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusMonth).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(statusYear).click();
		driver1.navigate().back();

		
		
	}

}