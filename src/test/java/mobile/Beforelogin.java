package mobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AfterLoginDoctorList.AfterLoginDashBoard;
import AfterLoginDoctorList.AfterLoginMonitoring;
import AfterLoginDoctorList.Appointment;
import BeforeLogin.Doctors;
import BeforeLogin.Filter;
import BeforeLogin.HealthRecord;
import BeforeLogin.LoginFunction;
import BeforeLogin.Monitoring;
import BeforeLogin.OtpFunction;
import BeforeLogin.Reminder;
import BeforeLogin.Skip;
import BeforeLogin.UrgentCare;
import HealthRecord.HealthRecordMainScreen;
import HealthRecord.healthRecordTabWork;
import HealthRecord.healthRecordUpload;
import PageObject.MonitoringVitals.BMI;
import PageObject.MonitoringVitals.BPVitals;
import PageObject.MonitoringVitals.Pulse;
import PageObject.MonitoringVitals.RRVitals;
import PageObject.MonitoringVitals.SpO2;
import PageObject.MonitoringVitals.Temp;

public class Beforelogin extends BaseClass {
	@Test
	public void NegativeScenarios() throws InterruptedException, IOException{
		service=startServer();
		driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Skip skip=new BeforeLogin.Skip(driver);
		Doctors doctors=new BeforeLogin.Doctors(driver);
		Monitoring monitor=new BeforeLogin.Monitoring(driver);
		HealthRecord healthRecord=new HealthRecord(driver);
		Reminder reminder=new BeforeLogin.Reminder(driver);
		UrgentCare urgentCare=new BeforeLogin.UrgentCare(driver);
		Doctors doctorsReturn=new BeforeLogin.Doctors(driver);
		Filter filter=new BeforeLogin.Filter(driver);
		
		}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
}
