package com.Here.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.here.pageobjects.DocumentionPage;

@RunWith(Cucumber.class)
public class DocumentationFeatureTest extends DocumentionPage {

	String pageTitle;
	
	@Given("^User should be able to launch the browser$")
	public void user_should_be_able_to_launch_the_browser()  {
	   initialisation();
	}

	@When("^User should be able to navigate to the required URL \"([^\"]*)\"$")
	public void user_should_be_able_to_navigate_to_the_required_URL(String Url){
		pageTitle=lanchTheURL(Url);
		Assert.assertEquals("Documentation, Code Examples and API References - HERE Developer", pageTitle);
	}

	@Then("^Get all the Links on the web page$")
	public void get_all_the_Links_on_the_web_page(){
		validateAllTheLinksResposeCodeAndAngularJSInitializedOrNot();
	}
	
	@Then("^Close the browser$")
    public void close_the_browser()  {
        driver.close();
    }

	

}