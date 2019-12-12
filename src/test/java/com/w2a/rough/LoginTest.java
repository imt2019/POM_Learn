package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LogInPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomepage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;

public class LoginTest extends Page {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		LogInPage lp = home.goToLogIn();
		ZohoAppPage zp= lp.doLogIn("imtiaj.ciem@yahoo.com", "imtiaj2019");
		CRMHomepage cp = zp.goToCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountsPage crt_accnt = account.gotoCreateAccount();
		crt_accnt.createAccount("Raman");
	}

}
