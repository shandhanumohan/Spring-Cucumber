package com.sample.test.cucumber.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddStepdefs extends AbstractStepdef {
    
    
    @When("^the user calls with values \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserCallsWithValuesAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        result = calculate.add(arg0, arg1);
    }

    @Then("^the user receives answer as \"([^\"]*)\"$")
    public void theUserReceivesAnswerAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(result, Integer.parseInt(arg0));
    }
}
