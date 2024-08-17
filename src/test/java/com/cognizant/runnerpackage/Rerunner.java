package com.cognizant.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
				glue="com.congnizant.pageexecution",
				dryRun = false,
				tags="@Smoke",
				plugin= {"html:Report/WebReport.html","json:Report/JsonReport.json", "rerun:target/rerun.txt"})
public class Rerunner {

}
