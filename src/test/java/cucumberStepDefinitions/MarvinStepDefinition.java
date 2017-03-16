package cucumberStepDefinitions;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.java.en.Then;


public class MarvinStepDefinition {

	int a, b, c;
	
	@Given("^I have two numbers$")
	public void i_have_two_numbers() throws Throwable {
	    a = 2;
	    b = 2;
	};

	@When("^I add those numbers together$")
	public void add_numbers_together() throws Throwable {
		c = a + b;
	}
	
	@Then("^I get the right answer$")
	public void verifyAnswer() throws Throwable {
		Assert.assertEquals(c,4,0);
	}
	
}
