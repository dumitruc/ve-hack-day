package com.visaeurope.savethechildren.core.stepdefs;

import com.visaeurope.savethechildren.core.CollectionNode;
import com.visaeurope.savethechildren.core.Node;
import com.visaeurope.savethechildren.core.Report;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.util.PendingException;

import com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by dima on 20/08/2015.
 */
public class StepDefRequests {

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefRequests.class);

    Node definedNode;

    @Given("^I am planning to do a donations (.*)")
    public void I_am_planning_to_do_a_donations_collection(String nodeType) throws Throwable {
        LOGGER.info("Planning to do a donation collection");
        if (nodeType.contains("collection")) {
            definedNode = new CollectionNode();
        } else {
            throw new PendingException("Not yet implemented");
        }
    }

    @And("^I do not have an account$")
    public void I_do_not_have_an_account() throws Throwable {
        LOGGER.info("I do not have an account!");
    }

    @When("^I submit all the required details on the registration form$")
    public void I_submit_all_the_required_details_on_the_registration_form() throws Throwable {


    }

    @When("^I successfully submit all the required details of the activity$")
    public void I_submit_all_the_required_details_of_the_activity() throws Throwable {
        Report newReport = new Report();
        newReport.setExtraInfo("This is some extra info I know");


        given().
                body(newReport).
                contentType("application/json").
        when().put("http://localhost:8181/report/id56353").
        then().
                statusCode(202);

    }

    @When("^I successfully submit following details of the activity$")
    public void I_successfully_submit_following_details_of_the_activity(DataTable reportData) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new cucumber.api.PendingException();
    }
}
