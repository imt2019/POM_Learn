package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	
	public void goToCotactSupport() {
		
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public LogInPage goToLogIn() {
		click("loginlink_CSS");
		
		return new LogInPage();
	}
	
	public void goToConatctSales() {
		driver.findElement(By.cssSelector(".zh-contact")).click();
	}
	
	public void goToLearnMore() {
		
	}
	
	public void validateFooterLink() {
		
	}

}
