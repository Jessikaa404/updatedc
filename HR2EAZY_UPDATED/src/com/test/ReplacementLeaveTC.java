package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.servlet.jmx.HolderMBean;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.hr2eazy.applypages.Homepage;
import com.hr2eazy.applypages.Loginpage;
import com.hr2eazy.applypages.Popuphome;
import com.hr2eazy.applypages.ReplacementApplypage;
import com.hr2eazy.applypages.Replacementleavelandingpage;

public class ReplacementLeaveTC {
	
	WebDriver driver=BrowserFactory.startbrowser("chrome", "https://qaen.hr2eazy.com/");
	
	@Test(priority=0)
	public void login() {
		Loginpage login=PageFactory.initElements(driver, Loginpage.class);
		login.login_hr2eazy("udai", "qaz4321");
		
	}
	
	@Test(priority=1)
	public void popupclose() {
		//Popuphome popup=new Popuphome(driver);
		Popuphome popup=PageFactory.initElements(driver, Popuphome.class);
		popup.popupclose();
	}
	
	@Test(priority=2)
	public void Replacementleaveapply() {
		Homepage home=PageFactory.initElements(driver, Homepage.class);
		home.replacemenycheck();
		Replacementleavelandingpage rpl=PageFactory.initElements(driver, Replacementleavelandingpage.class);
		rpl.applyrpl();
		ReplacementApplypage rplapply=PageFactory.initElements(driver, ReplacementApplypage.class);
		rplapply.fromdate("5", "7");
		rplapply.Todate("5", "7");
		rplapply.reason("Test Automation");
		rplapply.submitbtn();
		
		
	}

}
