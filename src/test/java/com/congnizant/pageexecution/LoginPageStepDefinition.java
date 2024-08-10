package com.congnizant.pageexecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cognizant.basepackage.BaseClass;
import com.cognizant.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	
	@Given("Launch browser and load Url")
	public void launch_browser_and_load_url() throws IOException {
	    BaseClass.browserLaunch();
	    BaseClass.loadUrl(BaseClass.getProperty("SiteUrl"));
	}

	@When("Provide valid username and password then login")
	public void provide_valid_username_and_password_then_login() throws IOException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(BaseClass.getProperty("UserName"));
		lp.passWord.sendKeys(BaseClass.getProperty("PassWord"));
		lp.loginBtn.click();
		
	}

	@Then("Validate the user logged in and close browser")
	public void validate_the_user_logged_in_and_close_browser() {
	    BaseClass.closeBrowser();
	}
	
	@When("Provide invalid username and password then login")
	public void provide_invalid_username_and_password_then_login() throws IOException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys("UserName");
		lp.passWord.sendKeys("PassWord");
		lp.loginBtn.click();
	}
	
	@When("Provide valid {string} and {string} then login")
	public void provide_valid_and_then_login(String username, String password) {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(username);
		lp.passWord.sendKeys(password);
		lp.loginBtn.click();
	}

}
