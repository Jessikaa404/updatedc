package com.hr2eazy.applypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Replacementleavelandingpage {
WebDriver driver;

@FindBy(id="ctl00_ContentPlaceHolder1_BtnApply")
WebElement Applyreplacementleave;

@FindBy(id="ctl00_ContentPlaceHolder1_btncancel_replacement_leave")
WebElement cancelreplacementleave;

@FindBy(id="ctl00_ContentPlaceHolder1_btnClaim")
WebElement Claimreplacementleave;

@FindBy(id="ctl00_ContentPlaceHolder1_BtnCancelReplacement")
WebElement Cancelclaimreplacementleave;

public Replacementleavelandingpage(WebDriver driver) {
	this.driver=driver;
}

public void applyrpl() {
	Applyreplacementleave.click();
}

public void cancelrpl() {
	cancelreplacementleave.click();
}

public void claimrpl() {
	Claimreplacementleave.click();
}

public void cancelclaimrpl() {
	Cancelclaimreplacementleave.click();
}


}
