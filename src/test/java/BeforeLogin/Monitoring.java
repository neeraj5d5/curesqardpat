package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Monitoring {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String monitoringTab = "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";

	public Monitoring(AppiumDriver<MobileElement> driver) {
		try {
		String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
		Assert.assertEquals("  OUR SERVICES",ourServices);
		String monitoring = driver.findElementByXPath(monitoringTab).getAttribute("content-desc");
		Assert.assertEquals("MONITORING", monitoring);
	

		
	
		
		
		

		TabMonitoring(driver);
		
		
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
		// TODO Auto-generated constructor stub
	}

	public void TabMonitoring(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(monitoringTab).click(); 
		System.out.println("Cause is :TabMonitoring");

		
	}

}


