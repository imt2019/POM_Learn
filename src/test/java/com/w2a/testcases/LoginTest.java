package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LogInPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.utilitis.Utilities;


public class LoginTest extends BaseTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data) {
		HomePage home = new HomePage();
		LogInPage lp = home.goToLogIn();
		lp.doLogIn(data.get("username"), data.get("password"));
	}

}
