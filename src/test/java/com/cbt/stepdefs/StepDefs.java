package com.cbt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {
	
	private WebDriver driver;
	
	public StepDefs(){
		
	}
	
	public StepDefs(SharedDriver sharedDriver){
		driver = sharedDriver;
	}
	

@Given("^I am on home page$")
public void i_am_on_home_page() throws Throwable {
    driver.get("http://google.com");
    
}

@Then("^I should able to (.*)$")
public void i_should_able_to_login(String option) throws Throwable {
    driver.findElement(By.name("q")).sendKeys(option);
    Thread.sleep(2000);
}

}
