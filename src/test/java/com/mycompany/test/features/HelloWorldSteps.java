package com.mycompany.test.features;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mycompany.test.pageObjects.HomePage;
import com.mycompany.test.pageObjects.WebSite;
import org.springframework.beans.factory.annotation.Autowired;

import cuke4duke.Given;
import cuke4duke.Then;
import cuke4duke.When;
import cuke4duke.spring.StepDefinitions;

@StepDefinitions
public class HelloWorldSteps {

	@Autowired WebSite webSite;
	private HomePage homePage;

	@Given("I have a skeleton web application")
	public void haveSkeletonWebApplication() {
		assertNotNull(webSite);
	}

	@When("I open the home page")
	public void openHomePage() {
		homePage = webSite.openHomePage();
	}

	@Then("the page heading should be \"(.*)\"")
	public void shouldHavePageHeading(String expectedTitle) {
		assertTrue(homePage.hasPageHeading(expectedTitle));
	}
}
