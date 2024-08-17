package com.congnizant.pageexecution;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImp {
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("After Scenario");
	}

}
