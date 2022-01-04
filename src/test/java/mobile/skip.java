package mobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BeforeLogin.Skip;


public class skip extends BaseClass {
	@Test
	public void NegativeScenarios() throws InterruptedException, IOException{
		service=startServer();
		driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Skip skip=new BeforeLogin.Skip(driver);
		
		}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	
}
