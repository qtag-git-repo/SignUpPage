package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver logindriver;
	
	public LoginPage(WebDriver remotedriver)
	{
		logindriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	@FindBy(xpath = "//button[@routerlink='/login-otp-request']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(id = "userLogin")
	@CacheLookup
	WebElement txtNumber;
	
	@FindBy(xpath = "//button[@type='submit']//span[1]")
	@CacheLookup
	WebElement btnOTP;
	
	@FindBy(id = "otp")
	@CacheLookup
	WebElement btnClick;
	
	@FindBy(id = "otp")
	@CacheLookup
	WebElement txtOTP;
	
	@FindBy(xpath = "//button[@type='submit']//span[1]")
	@CacheLookup
	WebElement btnverify;
	
	public void clickLogin()
	{
		loginButton.click();
	}
	public void setPhoneNumber(CharSequence[] number)
	{
		txtNumber.clear();
		txtNumber.sendKeys(number);
	}
	public void clickButton()
	{
		btnOTP.click();
	}
 

}
