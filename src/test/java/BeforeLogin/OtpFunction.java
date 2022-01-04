package BeforeLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OtpFunction {
	public String otpField="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String verifyButton="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']/android.widget.Button[@index='0']";
	AppiumDriver<MobileElement> driver1;
	public OtpFunction(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(3);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void PositiveOtp() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
			driver1.findElementByXPath(otpField).click();
			driver1.findElementByXPath(otpField).sendKeys("123456");
			driver1.findElementByXPath(verifyButton).click();
			System.out.println("Cause is :PositiveOtp");
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	
}

public void NegativeOtp() {
	String[] otpList= {"253653", "125486", "225469", "257956"};
	for(int i=0; i<otpList.length;i++) {
		driver1.findElementByXPath(otpField).click();
//		driver1.findElementByXPath(otpField).sendKeys(otpList[i]);
		try {
			TimeUnit.SECONDS.sleep(2);
			 MobileElement text = driver1.findElementByXPath(otpField);
			text.sendKeys(otpList[i]);
			text.clear();
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
		
		

		driver1.findElementByXPath(verifyButton).click();
		
		
		

		try {
			String toast = "//android.widget.Toast[1]";
			String toast1=driver1.findElementByXPath(toast).getAttribute("content-desc");
			Assert.assertEquals("invalid OTP", toast1);

			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	}
}

}
	
