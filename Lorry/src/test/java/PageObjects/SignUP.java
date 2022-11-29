package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUP 
{
	WebDriver driver;
	
	public SignUP(WebDriver driver)
	{
	        this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/button[1]")
	@CacheLookup
	WebElement btnsignup;
	
	@FindBy(xpath = "//div[@id='cdk-step-content-1-0']//div[1]//div[1]//div[1]//div[1]//mat-label[1]")
	@CacheLookup
	WebElement SelectLang;
	
	@FindBy(id= "name")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(id= "mat-input-3")
	@CacheLookup
	WebElement Number;
	
	@FindBy(id="mat-checkbox-3-input")
	@CacheLookup
	WebElement checkbox;
	
	@FindBy(css="#accept > .mat-button-wrapper")
	@CacheLookup
	WebElement acceptbtn;
	
	@FindBy(css= ".cdk-focused > .mat-button-wrapper")
	@CacheLookup
	WebElement clickRegister;
	
	
	
	/*@FindBy(id="otpCode")
	@CacheLookup
	WebElement otpbox;
	
	@FindBy(css=".cdk-focused")
	@CacheLookup
	WebElement VerifyOtp;*/
	
	
	public void clickSignUp()
	{
		btnsignup.click();
	}
	
	public void selectLanguage()
	{
		SelectLang.click();
	}
	
	public void setUserName(String name)
	{
		UserName.clear();
		UserName.sendKeys(name);
	}
	
	public void setPhoneNumber(String number)
	{
		Number.clear();
		Number.sendKeys(number);
	}
	
	public void checkBox()
	{
		checkbox.click();
	}
	
	public void acceptTC()
	{
		acceptbtn.click();
	}
	
	public void registerButton()
	{
		clickRegister.click();
	}
	
	/*public void setverifyOtp(String otpCode)
	{
		otpbox.clear();
		otpbox.sendKeys(otpCode);
	}
	
	public void  VerifyCode()
	{
		VerifyOtp.click();
	}*/
	
	
}
