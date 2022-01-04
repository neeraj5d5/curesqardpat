package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UrgentCare {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	
	public String urgentCareTab = "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='6']";

	public UrgentCare(AppiumDriver<MobileElement> driver) {
		try {
		String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
		Assert.assertEquals("  OUR SERVICES",ourServices);
		String urgentCare = driver.findElementByXPath(urgentCareTab).getAttribute("content-desc");
		Assert.assertEquals("URGENT CARE", urgentCare);
	

	
		
		
		

		TabUrgentCare(driver);
		
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
	
	}

	public void TabUrgentCare(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(urgentCareTab).click(); 
		System.out.println("Cause is :TabUrgentCare");



		
	}

}
