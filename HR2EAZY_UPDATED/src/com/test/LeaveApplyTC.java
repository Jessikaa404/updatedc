package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.hr2eazy.applypages.Homepage;
import com.hr2eazy.applypages.LeaveApply;
import com.hr2eazy.applypages.Loginpage;
import com.hr2eazy.applypages.Popuphome;

public class LeaveApplyTC {
	
	WebDriver driver=BrowserFactory.startbrowser("chrome", "https://qaen.hr2eazy.com/");
	
	@Test(priority=0)
	public void checklogin() {
		Loginpage login=PageFactory.initElements(driver, Loginpage.class);
		login.login_hr2eazy("udai", "qaz4321");
		
	}
	
	@Test(priority=1)
	public void popupclose() {
		Popuphome pop=PageFactory.initElements(driver, Popuphome.class);
		pop.popupclose();
	}
	
	@Test(priority=2)
	public void leaveapply() {
		Homepage applybtn=PageFactory.initElements(driver, Homepage.class);
		LeaveApply leave=PageFactory.initElements(driver, LeaveApply.class);
		applybtn.applyleavebtn();
		leave.leavetype("AL");
		leave.Applytype("entitle");
		leave.leavereason("Test Automation");
		leave.fromdate("7", "8");
		leave.Todate("7", "8");
		leave.attach("C:\\VM - 16-10\\Hr2eazy_Privelege_Access.pdf");
		leave.submit();
	}
	

}
