package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomepage;

public class ZohoAppPage extends Page {

	
	public CRMHomepage goToCRM() {
		click("crmlink_CSS");
		
		return new CRMHomepage();
	}
	
	public void goToCalendar() {
		driver.findElement(By.cssSelector(".zicon-apps-calendar.zicon-apps-96")).click();
	}
	

}
