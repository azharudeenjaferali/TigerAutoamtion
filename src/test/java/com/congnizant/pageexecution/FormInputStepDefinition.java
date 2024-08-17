package com.congnizant.pageexecution;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cognizant.basepackage.BaseClass;
import com.cognizant.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormInputStepDefinition {

	@Given("launch browser and open url")
	public void launch_browser_and_open_url() {
	    System.out.println("launch browser and open url");
	}

	@When("provide all valid details to fill the form")
	public void provide_all_valid_details_to_fill_the_form(io.cucumber.datatable.DataTable dataTable) {
//		List<String> values = dataTable.asList();  //to List
//		System.out.println(values);
//		System.out.println(values.get(3));
		
		//*************************************************
		
//		List<List<String>> allAddress = dataTable.asLists(); //to List of list
//		List<String> permanentAddress = allAddress.get(0);
//		System.out.println(permanentAddress.get(0));
//		System.out.println(permanentAddress.get(1));
//		System.out.println(permanentAddress.get(2));
//		
//		List<String> presentAddress = allAddress.get(1);
//		System.out.println(presentAddress.get(0));
//		System.out.println(presentAddress.get(1));
//		System.out.println(presentAddress.get(2));
		
		//*************************************************
		
		List<Map<String, String>> allAddress = dataTable.asMaps();     //asMaps = list of map
		Map<String, String> permanentAddress = allAddress.get(1);
		Set<Entry<String, String>> entrySet = permanentAddress.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

	@When("submit the form and create account")
	public void submit_the_form_and_create_account() {
	    System.out.println("submit the form and create account");
	}

	@Then("Validate if the account created")
	public void validate_if_the_account_created() {
	    System.out.println("Validate if the account created");
	}
}
