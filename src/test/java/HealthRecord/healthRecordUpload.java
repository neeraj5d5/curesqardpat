package HealthRecord;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class healthRecordUpload {
	public String files="//android.view.View[@index='0']/android.view.View[@index='9']/android.widget.ImageView[@index='0']";
	public String Upload="//android.view.View[@index='0']/android.view.View[@index='9']/android.widget.ImageView[@index='1']";
	public String selectFile="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='0']";
	public String selectImage1="//android.widget.FrameLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.support.v7.widget.RecyclerView[@index='0']/android.widget.RelativeLayout[@index='0']";
	public String dropdown="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='3']";
	public String forms="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']";
	public String doctorReports="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String eRx="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']";
	public String labReports="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='3']";
	public String NOTES="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String save="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='4']/android.widget.Button[@index='0']";
	public String editfile="//android.widget.Button[@content-desc='Edit']";
	public String sharefile="//android.widget.Button[@content-desc='Share']";
	public String openfile="//android.widget.Button[@content-desc='Open']";
	public String deletefile="//android.widget.Button[@content-desc='Delete']";
	public String EditFileName="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	public String save1="//android.widget.Button[@content-desc='SAVE FILE']";
	public String threedots="//android.view.View[@index='0']/android.view.View[@index='8']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']/android.widget.Button[@index='0']";
	
	public void scrollUp(AppiumDriver<MobileElement> driver12) {
		TouchAction  action =new TouchAction(driver12);  
	    Dimension size  =driver12.manage().window().getSize();
	    int width=size.width;
	    int height=size.height;             
	    int middleOfX=width/2;
	    int startYCoordinate= (int)(height*.7);
	    int endYCoordinate= (int)(height*.2);
	    action.press(PointOption.point(middleOfX, startYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	}
	AppiumDriver<MobileElement> driver1;
	public healthRecordUpload(AppiumDriver<MobileElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
			driver1=driver;
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();	
		}
	}
	public void PositiveHealthRecordUpload() throws InterruptedException {
		
		editfile();
		
		
		
		
		
		

	}
	public void editfile() throws InterruptedException {
		TimeUnit.SECONDS.sleep(10);
		
		driver1.findElementByXPath(threedots).click();
		TimeUnit.SECONDS.sleep(5);
		driver1.findElementByXPath(editfile).click();

		TimeUnit.SECONDS.sleep(5);

		System.out.println("Cause is :his");
		driver1.findElementByXPath(EditFileName).click();
		driver1.findElementByXPath(EditFileName).clear();
		driver1.findElementByXPath(EditFileName).sendKeys("qwer");
		driver1.findElementByXPath(save1).click();
	}
	public void Uplodefile() throws InterruptedException {
		driver1.findElementByXPath(Upload).click();
		driver1.findElementByXPath(selectFile).click();
		TimeUnit.SECONDS.sleep(10);
		driver1.findElementByXPath(selectImage1).click();
		TimeUnit.SECONDS.sleep(1);
		
	}
	public void Uplodefileforms() throws InterruptedException {
		driver1.findElementByXPath(dropdown).click();
		TimeUnit.SECONDS.sleep(1);
		driver1.findElementByXPath(forms).click();
		TimeUnit.SECONDS.sleep(1);
	}
	public void UplodefiledoctorReports() throws InterruptedException {
		driver1.findElementByXPath(dropdown).click();
		TimeUnit.SECONDS.sleep(1);
		driver1.findElementByXPath(doctorReports).click();
		TimeUnit.SECONDS.sleep(1);
	}
	public void UplodefileeRx() throws InterruptedException {
		driver1.findElementByXPath(dropdown).click();
		TimeUnit.SECONDS.sleep(1);
		driver1.findElementByXPath(eRx).click();
		TimeUnit.SECONDS.sleep(1);
	}
	public void UplodefilelabReports() throws InterruptedException {
		driver1.findElementByXPath(dropdown).click();
		TimeUnit.SECONDS.sleep(1);
		driver1.findElementByXPath(labReports).click();
		TimeUnit.SECONDS.sleep(1);
	}
	public void save() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		driver1.findElementByXPath(NOTES).click();
		driver1.findElementByXPath(NOTES).sendKeys("fuidhod");;
		TimeUnit.SECONDS.sleep(1);
		scrollUp(driver1);
		driver1.findElementByXPath(save).click();
		TimeUnit.SECONDS.sleep(1);
	}
	
}