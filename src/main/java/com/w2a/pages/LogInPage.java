package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LogInPage extends Page {
	

	public ZohoAppPage doLogIn(String username, String password) {
		type("username_CSS",username);
		click("nextbtn_CSS");
		type("password_CSS",password);
		click("nextbtn_CSS");
		
		return new ZohoAppPage();
	}
}
