package Talix.Automation.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import automation.common.AutoLogger;
import automation.common.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver, AutoLogger handler)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}	
	
	@FindBy(partialLinkText = "Password?")
	public WebElement ForgotPasswordLink;
	
	@FindBy(partialLinkText = "Username?")
	public	WebElement ForgotUserNameLink;
	
	@FindBy(id = "hlHccLoginSubmit")
	public	WebElement LoginButton;
	
	@FindBy(id = "hlHccLoginError-0")
	public	WebElement LoginError;	
	
	@FindBy(id = "hlHccLoginInput-1")
	public	WebElement PasswordField;
	
	@FindBy(className = "hl-hcc-login-lefttext2")
	public	WebElement PasswordText;
	
	@FindBy(className = "hl-hcc-login-logo")
	public	WebElement TalixLogo;
	
	@FindBy(id = "hlHccLoginInput-0")
	public	WebElement UsernameField;
	
	@FindBy(className = "hl-hcc-login-lefttext")
	public	WebElement UsernameText;
	
	
	public void login() {
		
		UsernameField.sendKeys("testlogin");		
		PasswordField.sendKeys("mX+3b2S_=u");
		LoginButton.click();		
	}
}
