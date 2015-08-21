package com.visaeurope.savethechildren.core.stepdefs;

import com.visaeurope.savethechildren.core.CollectionNode;
import com.visaeurope.savethechildren.core.Node;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.util.PendingException;

/**
 * Created by dima on 20/08/2015.
 */
public class StepDefRequests {

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefRequests.class);

    Node definedNode;

    @Given("^I am planning to do a donations (.*)")
    public void I_am_planning_to_do_a_donations_collection(String nodeType) throws Throwable {
        LOGGER.info("Planning to do a donation collection");
        if(nodeType.contains("collection")){
             definedNode = new CollectionNode();
        }else{
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
}
