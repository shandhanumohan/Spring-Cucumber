package com.sample.test.cucumber.stepdefs;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MultiStepDef extends AbstractStepdef {


    @When("^the client calls with values \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theClientCallsWithValuesAnd(String arg0, String arg1) {
       // result = Integer.parseInt(arg0) * Integer.parseInt(arg1);
        result = calculate.multiply(arg0, arg1);
    }
    @Then("^the client receives answer as \"([^\"]*)\"$")
    public void theClientReceivesAnswerAs(String arg0) {
            Assert.assertEquals(result, Integer.parseInt(arg0));

    }


}
