package BeforeLogin;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Filter {
	public String beforeLoginOurServices="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String filterXpath="//android.view.View[@index='0']/android.view.View[@index='7']/android.view.View[@index='0']/android.widget.EditText[@index='0']/android.widget.Button[@content-desc='FILTERS']";
	public String selectSpeciality="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String selectParticularSpeciality="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']";
	public String filterByDate="//android.view.View[@index=0]/android.view.View[@index=0]/android.view.View[@index=0]/android.view.View[@index='6']";
	public String filterByTime="//android.view.View[@index=0]/android.view.View[@index=0]/android.view.View[@index=0]/android.widget.Button[@index='11']";
	public String clickApply="//android.widget.Button[@content-desc='APPLY FILTERS']";
	public String loginButton="//android.view.View[@index=0]/android.view.View[@index=0]/android.view.View[@index=0]/android.widget.ImageView[@index='2']";
	public Filter(AppiumDriver<MobileElement> driver) {
		try {
			
			String ourServices=driver.findElementByXPath(beforeLoginOurServices).getAttribute("content-desc");
			Assert.assertEquals("  OUR SERVICES",ourServices);
			String filter = driver.findElementByXPath(filterXpath).getAttribute("content-desc");
			Assert.assertEquals("FILTERS", filter);
			
			
			ClickFilter(driver);

//			
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void ClickFilter(AppiumDriver<MobileElement> driver) throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(filterXpath).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(selectSpeciality).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(selectParticularSpeciality).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(clickApply).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(loginButton).click();
		System.out.println("Message  is : ClickFilter ");
		
	}

}