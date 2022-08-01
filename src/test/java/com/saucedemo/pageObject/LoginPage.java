package com.saucedemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu-toggle")
	WebElement toggleBtn;
	
	@FindBy(xpath="//*[@class=\"sidebar-nav\"]/li[3]/a")
	WebElement login;
	
	@FindBy(id="txt-username")
	WebElement txtUserName;
	
	@FindBy(id="txt-password")
	WebElement txtPassword;
	
	@FindBy(id="btn-login")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@class=\"col-sm-12 text-center\"]/h2")
	WebElement verifyPage;
	
	
	
	public void toggleButton() {
		toggleBtn.click();
	}
	
	public void login() {
		login.click();
	}
	
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void loginButton() {
		btnLogin.click();
	}
	
	public String getPageInfo() {
		String pageinfo = verifyPage.getText();
		return pageinfo;
	}
}
