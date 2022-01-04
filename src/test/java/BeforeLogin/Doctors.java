package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Doctors {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String doctorsTabXpath = "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@content-desc='DOCTORS']";
	public String loginButtonClick="//android.view.View[@index=0]/android.view.View[@index=0]/android.view.View[@index=0]/android.widget.ImageView[@index='2']";
	
	public Doctors(AppiumDriver<MobileElement> driver) {
		
		
		try {
		String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
		Assert.assertEquals("  OUR SERVICES",ourServices);
		String doctors = driver.findElementByXPath(doctorsTabXpath).getAttribute("content-desc");
		Assert.assertEquals("DOCTORS", doctors);
		

		TabDoctors(driver);
	
		
		
		
		
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
		// TODO Auto-generated constructor stub
	}

	

	public void TabDoctors(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(doctorsTabXpath).click(); 
		driver.findElementByXPath(doctorsTabXpath).click();
		System.out.println("Cause is :TabDoctors");
		



		
	}
	

	

}








