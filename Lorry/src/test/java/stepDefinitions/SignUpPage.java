package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.SignUP;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage 
{
	WebDriver driver;
	SignUP SP;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		SP=new SignUP(driver);  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url);

	}

	@And("User clicks on the SingUP button")
	public void user_clicks_on_the_sing_up_button() 
	{
		SP.clickSignUp();

	}

	@Then("User select the language")
	public void user_select_the_language() 
	{
		SP.selectLanguage();

	}

	@And("User enter {string} and phone {int}")
	public void user_enter_name_and_phone_number(String name, String number) 
	{

		SP.setUserName(name);
		SP.setPhoneNumber(number);
	}

	@Then("User click on check box to accept Terms and Conditions")
	public void user_click_on_check_box_to_accept_terms_and_conditions() 
	{
		SP.checkBox();

	}

	@And("User click Accept button on Terms and Conditions on PopUp window")
	public void user_click_accept_button_on_terms_and_conditions_on_pop_up_window() 
	{

		WebElement element = driver.findElement(By.cssSelector(".col-md-5 .mat-button-wrapper"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		SP.acceptTC();
	}

	@And("User Click on Register button")
	public void user_click_on_register_button() throws Exception 
	{
		SP.registerButton();
		Thread.sleep(2000);

	}

	@And("Close the browser")
	public void close_the_browser() 
	{
		driver.close();

	}


}
