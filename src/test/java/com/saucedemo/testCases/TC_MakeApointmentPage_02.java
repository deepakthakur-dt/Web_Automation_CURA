package com.saucedemo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pageObject.LoginPage;
import com.saucedemo.pageObject.MakeApointmentPage;

public class TC_MakeApointmentPage_02 extends BaseClass {
	
	@Test
	public void makeApointmentPageTest() {
		
		driver.get(baseURL);
		LoginPage lp1 = new LoginPage(driver);
		lp1.toggleButton();
		lp1.login();
		lp1.setUserName(username);
		lp1.setPassword(password);
		lp1.loginButton();
		
		//creating object of Appointment Page
		MakeApointmentPage ma = new MakeApointmentPage(driver);
		
		ma.checkBox();
		logger.info("clicked the checkbox");
		
		ma.visitDate();
		logger.info("Entered the date");
		
		ma.commentBox();
		logger.info("Entered the required comment");
		
		ma.appointmentBtn();
		logger.info("Clicked on appointment button");
		
		if(ma.getAppointmentInfo().equals("Please be informed that your appointment has been booked as following:")) {
			Assert.assertTrue(true);
			logger.info("Appointment has been scheduled");
		}
		else{
			Assert.assertTrue(false);
			driver.close();
			logger.info("Appointment has been scheduled");
			logger.info("------------***----------------");
		}
		
	}

}
