package com.saucedemo.testCases;

import org.testng.annotations.Test;

import com.saucedemo.pageObject.HistoryPage;
import com.saucedemo.pageObject.LoginPage;
import com.saucedemo.pageObject.MakeApointmentPage;

public class TC_HistoryPage2_04 extends BaseClass {
	
	@Test
	public void historyPageTest() {
		
		// login in
		driver.get(baseURL);
		LoginPage lp1 = new LoginPage(driver);
		lp1.toggleButton();
		lp1.login();
		lp1.setUserName(username);
		lp1.setPassword(password);
		lp1.loginButton();
		
		// Appointment
		MakeApointmentPage ma = new MakeApointmentPage(driver);
		ma.checkBox();		
		ma.visitDate();		
		ma.commentBox();		
		ma.appointmentBtn();
		
		//go back to home page
		ma.backToHomePageBtn();
		
		//again make an appointment
		logger.info("Making 2nd appointment");
		ma.checkBox();		
		ma.visitDate();		
		ma.commentBox();		
		ma.appointmentBtn();
		
		//to click on toggle button
		lp1.toggleButton();
		
		//creating object of History Page
		
		HistoryPage hp = new HistoryPage(driver);
		
		hp.history();
		logger.info("clicked on history");
		
		hp.numberOfAppointments();
		
		hp.recentAppointmentAndFacilityName();
		
	}

}		


