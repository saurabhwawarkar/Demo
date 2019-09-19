package Talix.Automation.Tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.common.BaseTest;
import automation.utilities.TalixUrls;
import Talix.Automation.Pages.LoginPage;

public class VerifyCorrectElementsDisplayedOnLoginPageTest extends BaseTest {
	
	LoginPage loginPage;	
	
	@BeforeClass
	public void LoginPage(){
		parent = report.startTest("Login Page","Login Page Test");
	}
	
	@Test
	public void verifyCorrectElementsDisplayedOnLoginPageTest() throws InterruptedException{
		
		loginPage = new LoginPage(eventDriver, handler);
		
		loginPage.ForgotPasswordLink.click();
		
		Assert.assertEquals(driver.getCurrentUrl(), TalixUrls.ForgetPasswordPageUrl);	
		
		quitBrowser();		
	}		
}
