package com.congnizant.pageexecution;

import java.io.IOException;

import com.cognizant.basepackage.BaseClass;
import com.cognizant.pagefactory.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	@Given("Launch amazon url")
	public void launch_amazon_url() {
	    System.out.println("Launch amazon url");
	}

	@Given("login to the account")
	public void login_to_the_account() {
	    System.out.println("login to the account");
	}

	@When("search product and select to add into cart")
	public void search_product_and_select_to_add_into_cart() {
	    System.out.println("search product and select to add into cart");
	}
	
	@Given("Launch browser and load amazon Url")
	public void launch_browser_and_load_amazon_url() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.getProperty("AmazonUrl"));
		
	}

	@When("Enter the product and search")
	public void enter_the_product_and_search() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Mobile");
		hp.searchBtn.click();
		
	}
	
	@When("Enter the laptop and search")
	public void enter_the_laptop_and_search() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Laptop");
		hp.searchBtn.click();
		
	}

	@Then("Validate the results")
	public void validate_the_results() {
		//validation
		BaseClass.closeBrowser();
	}

}
