package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HealthRecord {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String healthRecordTab = "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='4']";

	public HealthRecord(AppiumDriver<MobileElement> driver) {
		try {
		String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
		Assert.assertEquals("  OUR SERVICES",ourServices);
		String healthRecords = driver.findElementByXPath(healthRecordTab).getAttribute("content-desc");
		Assert.assertEquals("HEALTH RECORDS", healthRecords);
	

	
		
		
		

		TabHealthRecord(driver);
		
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
		// TODO Auto-generated constructor stub
	}

	public void TabHealthRecord(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(healthRecordTab).click(); 
		System.out.println("Cause is :TabHealthRecord");



		
	}

}

