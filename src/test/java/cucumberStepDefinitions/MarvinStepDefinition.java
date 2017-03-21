package cucumberStepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import marvin.Marvin;
import cucumber.api.java.en.Then;


@SuppressWarnings("deprecation")
public class MarvinStepDefinition {

	Marvin marvin = null;
	String lastReply = "";
	
	@Given("^I am talking to Marvin$")
	public void i_am_talking_to_marvin() throws Throwable {
	    marvin = new Marvin();
	    lastReply = "";
	};

	@When("^I say to Marvin, \"([^\"]*)\"$")
	public void talk_to_marvin(String testTalkString) throws Throwable {
		lastReply = marvin.talk(testTalkString);
	}
	
	@Then("^Marvin replies \"([^\"]*)\"$")
	public void verifyAnswer(String testReplyString) throws Throwable {
		Assert.assertEquals(testReplyString, lastReply);
	}
	
}
