package PageObject.MonitoringVitals;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BPVitals {
	public String RetryButton="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='8']";
	public String ManulButton="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='7']";
	public String BPCardPath="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.view.View[@index='4']";
	public String addBPVital="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String enterSysValue="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='8']";
	public String enterDiaValue="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='9']";
	public String saveBPData="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='2']";
	public String BpstatusWeek="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='5']";
	public String BpstatusMonth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='6']";
	public String BpstatusYear="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='7']";
	public String backButton="//android.view.View[@index='0']/android.widget.ScrollView[@index='0']/android.widget.Button[@index='0']";
	AppiumDriver<MobileElement> driver1;
	
	public BPVitals(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	public void PositiveBpVitals() throws InterruptedException {
		System.out.println("Cause is :PositiveBpVitals");
		driver1.findElementByXPath(addBPVital).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(enterSysValue).click();
		System.out.println("Cause is :PositiveBpVitals1");
		driver1.findElementByXPath(enterSysValue).sendKeys("110");
		driver1.findElementByXPath(enterDiaValue).click();
		driver1.findElementByXPath(enterDiaValue).sendKeys("75");
		driver1.findElementByXPath(addBPVital).click();
		TimeUnit.SECONDS.sleep(10);
		driver1.findElementByXPath(BpstatusWeek).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(BpstatusMonth).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(BpstatusYear).click();
		//driver.findElementByXPath(backButton).click();
		driver1.navigate().back();
		System.out.println("Cause is :PositiveBpVitals");
		


		

	}
	public void NegativeBpEntry() throws InterruptedException {
		String[] negativeSysValue= {"900", "10", "800"};
		String[] negativeDiaVal= {"878", "10", "700"};
		driver1.findElementByXPath(BPCardPath).click();
		try {
			
			TimeUnit.SECONDS.sleep(25);
			driver1.findElementByXPath(ManulButton).click();
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(2);
		
		for(int i=0; i<negativeSysValue.length; i++) {
			driver1.findElementByXPath(addBPVital).click();
			TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(enterSysValue).click();
		driver1.findElementByXPath(enterSysValue).sendKeys(negativeSysValue[i]);
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(addBPVital).click();
		}
		
		for(int i=0; i<negativeDiaVal.length; i++) {
			driver1.findElementByXPath(addBPVital).click();
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(enterDiaValue).click();
			driver1.findElementByXPath(enterDiaValue).sendKeys(negativeDiaVal[i]);
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(addBPVital).click();
		}
		System.out.println("Cause is :NegativeBpEntry");
		
	}

	
	}
