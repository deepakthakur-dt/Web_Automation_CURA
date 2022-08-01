package com.saucedemo.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.toggleButton();
		logger.info("Clicked on side bar");
		
		lp.login();
		logger.info("clicked on side bar login");
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.loginButton();
		
		if(lp.getPageInfo().equals("Make Appointment")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else{
			Assert.assertTrue(false);
			logger.info("Login test failed");
			driver.quit();			
			logger.info("------------***----------------");
		}	
	}
}
