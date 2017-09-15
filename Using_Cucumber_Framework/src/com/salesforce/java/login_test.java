package com.salesforce.java;

import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.java.en.*;

//step
public class login_test {
	
	login log=new login();
	
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void opening_app_on_browser(String url,String Browser) throws FileNotFoundException, IOException, InterruptedException 
	{
		log.Open_Browser(Browser);
		log.Navigate(url);
		
	}
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void type_in_value(String field,String value)
	{
		log.Enter_Values(field, value);		
	}
	@And("^I click on \"([^\"]*)\" button$")
	public void click_button(String buttontype)
	{
		log.Click_button(buttontype);		
	}
	@Then("^Login should be \"([^\"]*)\"$")
	public void verify_login(String result)
	{
		
	}
}
