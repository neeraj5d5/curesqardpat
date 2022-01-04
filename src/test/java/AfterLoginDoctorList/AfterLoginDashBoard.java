package AfterLoginDoctorList;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AfterLoginDashBoard {
	public String afterLoginDoctorsTab= "//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='1']";
	public String searchTest="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String filterTest="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']";
	public String selectSpeciality="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String selectSpec="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']";
	public String selectByDate="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='7']";
	public String selectByTime="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='12']";
	public String applyButton="//android.widget.Button[@content-desc='APPLY FILTERS']";
	public String selctDoctorCard="//android.view.View[@index='0']/android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";

	AppiumDriver<MobileElement> driver1;
	public AfterLoginDashBoard(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void PositiveDoctorsTab() throws InterruptedException {
		String lastVitalsXpath="//android.view.View[@index='0']/android.widget.ScrollView[@index='7']/android.view.View[@index='0']";
		String lastVitals=driver1.findElementByXPath(lastVitalsXpath).getAttribute("content-desc");
		Assert.assertEquals("LAST VITALS", lastVitals);
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(afterLoginDoctorsTab).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(searchTest).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(searchTest).sendKeys("neeraj");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(filterTest).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(selectSpeciality).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(selectSpec).click();
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(applyButton).click();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Cause is :hi1");
		driver1.findElementByXPath(selctDoctorCard).click();

		System.out.println("Cause is :hi5");
		System.out.println("Cause is :PositiveDoctorsTab");
		
	}
	

		
	}
