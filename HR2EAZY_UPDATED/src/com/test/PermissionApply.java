package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.hr2eazy.applypages.Homepage;
import com.hr2eazy.applypages.Loginpage;
import com.hr2eazy.applypages.Permissionpage;
import com.hr2eazy.applypages.Popuphome;

public class PermissionApply {
	
	WebDriver driver=BrowserFactory.startbrowser("chrome", "https://qaen.hr2eazy.com//");
	
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
	public void permissionapply() {
		Homepage permission=PageFactory.initElements(driver, Homepage.class);
		permission.permissiobtn();
		Permissionpage permissionobj=PageFactory.initElements(driver,Permissionpage.class );
		permissionobj.fromdate("6", "8");
		permissionobj.FromTime("04", "20", "PM");
		permissionobj.ToTime("05", "20", "PM");
		permissionobj.reasonapply("TestAutomation");
		permissionobj.successmsg();
		
	}
}
