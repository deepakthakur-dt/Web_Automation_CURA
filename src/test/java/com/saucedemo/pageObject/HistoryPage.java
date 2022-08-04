package com.saucedemo.pageObject;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {
	
WebDriver driver;
	
	public HistoryPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class=\"sidebar-nav\"]/li[3]/a")
	WebElement historyBtn;
	
	@FindBy(xpath="//*[@id=\"history\"]/div/div[2]/div")
	List<WebElement> cards;
	
	@FindBy(xpath="//*[@id=\"history\"]/div/div[2]/div[1]/div/div[1]")
	WebElement appointmentDate;
	
	@FindBy(xpath="//*[@id=\"history\"]/div/div[2]/div[1]/div/div[2]/div[2]/p")
	WebElement facilityName;
	
	
	public void history() {
		historyBtn.click();
	}
	
	public int numberOfAppointments() {
		//List<WebElement> cards = driver.findElements(By.xpath("//*[@id=\"history\"]/div/div[2]/div"));
		System.out.println("Appointment present: " +cards.size());
		return cards.size();
	}
	
	public void recentAppointmentAndFacilityName() {
		System.out.println("Recent made appointment Date & Facility name:" +appointmentDate.getText() +" " +facilityName.getText()); 
	}
	
	

}
