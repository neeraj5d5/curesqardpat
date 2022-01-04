package mobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class HealthRecords extends BaseClass{
	
	
	@Test
	public void NegativeScenarios() throws InterruptedException, IOException{
		service=startServer();
		driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Skip skip=new BeforeLogin.Skip(driver);
		
		Doctors doctorsReturn=new BeforeLogin.Doctors(driver);
		Filter filter=new BeforeLogin.Filter(driver);
		LoginFunction login=new BeforeLogin.LoginFunction(driver);
		login.PositivePhoneNumber();
		OtpFunction otp=new BeforeLogin.OtpFunction(driver);
		//otp.NegativeOtp();
		otp.PositiveOtp();
		Thread.sleep(20);
		
		HealthRecordMainScreen healthRecord1=new HealthRecordMainScreen(driver);
		healthRecord1.PositiveHealthRecordMainScreen();
		healthRecordTabWork healthRecordTabWork=new healthRecordTabWork(driver);
		healthRecordTabWork.PositiveHealthRecordMainScreen();
		//searchFile searchFun=new searchFile(driver);
		//searchFun.PositiveHealthRecordUpload();
		healthRecordUpload upload=new healthRecordUpload(driver);
		
		upload.PositiveHealthRecordUpload();
		}
}
