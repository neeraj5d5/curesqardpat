package BeforeLogin;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginFunction {
	public String loginField="//android.view.View[@index='0']/android.view.View[@index='2']/android.widget.EditText[@index='1']";
	public String enterButton="//android.view.View[@index='3']/android.widget.Button[@index='0']";
	public String boatbutton="//android.widget.GridView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']";
	
	AppiumDriver<MobileElement> driver1;
	public LoginFunction(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
		
	}
	public void PositivePhoneNumber() throws InterruptedException {
		driver1.findElementByXPath(loginField).click();
		driver1.findElementByXPath(loginField).sendKeys("9876543210");
		driver1.findElementByXPath(enterButton).click();
		TimeUnit.SECONDS.sleep(10);
		TimeUnit.SECONDS.sleep(25);
		System.out.println("Cause is :PositivePhoneNumber");
		
	}


public void NegativePhone() {
	String[] phoneNumber= {"95215", "85202125"};
	for(int i=0; i<phoneNumber.length; i++) {
		driver1.findElementByXPath(loginField).click();
		driver1.findElementByXPath(loginField).sendKeys(phoneNumber[i]);
		driver1.findElementByXPath(enterButton).click();
		try {
			String phoneNumberError="//android.view.View[@index='0']/android.view.View[@index='2']/android.widget.EditText[@index='1']/android.view.View[@index='0']";
			String phoneNumberErrorMsg=driver1.findElementByXPath(phoneNumberError).getAttribute("content-desc");
			Assert.assertEquals("Enter valid mobile number", phoneNumberErrorMsg);
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
		}

	}
}
}