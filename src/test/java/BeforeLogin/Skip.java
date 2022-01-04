package BeforeLogin;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Skip {
	public String skipXpath = "//android.view.View[@index='0']/android.widget.Button[@index='1']";
	public Skip(AppiumDriver<MobileElement> driver) {
		try {
		String high = driver.findElementByXPath(skipXpath).getAttribute("content-desc");
		System.out.println(high);
		Assert.assertEquals("SKIP", high);
		SkipFucntionality(driver);
		SkipFucntionality(driver);
		SkipFucntionality(driver);
		}catch (Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			}	
		// TODO Auto-generated constructor stub
	}

	public void SkipFucntionality(AppiumDriver<MobileElement> driver) {
		driver.findElementByXPath(skipXpath).click();  //Skip function check
		System.out.println("Cause is :SkipFucntionality");
		
	}

}
