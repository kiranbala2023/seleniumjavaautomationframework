package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		System.out.println("Title of the page is :"+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}

}
