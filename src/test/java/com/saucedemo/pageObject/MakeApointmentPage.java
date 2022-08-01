package com.saucedemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeApointmentPage {
	
WebDriver driver;
	
	public MakeApointmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="chk_hospotal_readmission")
	WebElement checkBox;
	
	@FindBy(id="txt_visit_date")
	WebElement visitDate;
	
	@FindBy(id="txt_comment")
	WebElement commentBox;
	
	@FindBy(id="btn-book-appointment")
	WebElement bookAppointmentbtn;
	
	@FindBy(xpath="//*[@class=\"col-xs-12 text-center\"]/p")
	WebElement verifyAppointment;
	
	public void checkBox() {
		checkBox.click();
	}
	
	public void visitDate() {
		visitDate.sendKeys("02/08/2022");
	}
	
	public void commentBox() {
		commentBox.sendKeys("Done");
	}
	
	public void appointmentBtn() {
		bookAppointmentbtn.click();
	}
	
	public String getAppointmentInfo() {
		String appointmentinfo = verifyAppointment.getText();
		return appointmentinfo;
	}

}
