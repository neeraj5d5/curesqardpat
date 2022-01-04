package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Reminder {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	
	public String reminderTab = "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='5']";

	public Reminder(AppiumDriver<MobileElement> driver) {
		try {
		String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
		Assert.assertEquals("  OUR SERVICES",ourServices);
		String reminders = driver.findElementByXPath(reminderTab).getAttribute("content-desc");
		Assert.assertEquals("REMINDERS", reminders);
	

		
	
		
		
		

		TabReminder(driver);
		
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
		// TODO Auto-generated constructor stub
	}

	public void TabReminder(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(reminderTab).click(); 
		System.out.println("Cause is :TabReminder");


		
	}

}
