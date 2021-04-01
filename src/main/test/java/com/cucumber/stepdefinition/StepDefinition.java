package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.runner.Runner;
import com.framework.org.CucumberFramework.base1;
import com.pom.org.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends base1{
	
	public static WebDriver driver = Runner.driver;
	
	LoginPage lp = new LoginPage(driver);

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
	    geturl("https://adactinhotelapp.com/HotelAppBuild2/");
	}

	@When("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
		sendkeyz(lp.getName(), "SowmiyaSri");
	}

	@When("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
	    sendkeyz(lp.getPassword(), "Sowmiya05");
	}

	@Then("^User validates the username and password$")
	public void user_validates_the_username_and_password() throws Throwable {
		click2(lp.getPassword());
	}

}
