package AfterLoginDoctorList;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Appointment {
	public String audioCallButton="//android.view.View[@index='0']/android.view.View[@index='1']/android.widget.ImageView[@index='0']";
	public String timeSelect1="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']/android.widget.HorizontalScrollView[@index='0']/android.view.View[@index='1']";
	public String timeSelect2="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']/android.widget.HorizontalScrollView[@index='0']/android.view.View[@index='2']";
	public String timeSelect3="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']/android.widget.HorizontalScrollView[@index='0']/android.view.View[@index='3']";
	public String timeSelect4="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']/android.widget.HorizontalScrollView[@index='0']/android.view.View[@index='4']";
	public String symptomsWrite="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='7']";
	public String backButton="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String symptomsWrite1="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String makeAppoimentButton="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='7']/android.widget.Button[@index='0']";
	public String confirmApp="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='9']";
	AppiumDriver<MobileElement> driver1;
	public Appointment(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(3);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
		
		}
	public void PositiveAppoiment() {
		
		driver1.findElementByXPath(audioCallButton).click();
		

		try {
			TimeUnit.SECONDS.sleep(3);
			
			driver1.findElementByXPath(timeSelect1).click();
			TimeUnit.SECONDS.sleep(3);
			driver1.findElementByXPath(timeSelect2).click();
			TimeUnit.SECONDS.sleep(3);
			driver1.findElementByXPath(timeSelect3).click();
			TimeUnit.SECONDS.sleep(3);
			TouchAction  action =new TouchAction(driver1);  
		    Dimension size  =driver1.manage().window().getSize();
		    int width=size.width;
		    int height=size.height;             
		    int middleOfX=width/2; 	
		    int startYCoordinate= (int)(height*.7);
		    int endYCoordinate= (int)(height*.2);
		    action.press(PointOption.point(middleOfX, endYCoordinate))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
            .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
		    TimeUnit.SECONDS.sleep(3);
		    action.press(PointOption.point(middleOfX,startYCoordinate))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
		    TimeUnit.SECONDS.sleep(3);

			driver1.findElementByXPath(symptomsWrite1).click();
			driver1.findElementByXPath(symptomsWrite1).sendKeys("Fiver");
			driver1.findElementByXPath(backButton).click();
			//driver1.findElementByXPath(makeAppoimentButton).click();
			//driver1.findElementByXPath(confirmApp).click();
			System.out.println("Cause is :PositiveAppoiment");
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	}
