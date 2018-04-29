package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsClass {
	
	WebDriver driver = new FirefoxDriver();
	
	LandingPage lp;
	FlightSearch fs;
	
	@Given("^I am in Goibibo website$")
	public void i_am_in_Goibibo_website() throws Throwable {
	    lp = new LandingPage(driver);
	    lp.navigateToGoibibo();
	    
	}

	@When("^I enter flight from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_enter_flight_from_to(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //lp.cancelPopup();
	    lp.enterFlightDetails(arg1, arg2);
	    
	}

	@When("^I click on Departure day for the next day$")
	public void i_click_on_Departure_day_for_the_next_day() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		lp.chooseDepartDate();
	}

	@When("^I click on Return day for after (\\d+) days$")
	public void i_click_on_Return_day_for_after_days(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		lp.chooseReturnDate();
	}

	@When("^I click on Get Set Go button$")
	public void i_click_on_Get_Set_Go_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fs = lp.clickSearch();
	    fs.showAllFlights();
	}

	@When("^I select earliest departure for the next day$")
	public void i_select_earliest_departure_for_the_next_day() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fs.selectEarliestDeparture();
	}

	@When("^I select earliest departure for the return flight$")
	public void i_select_earliest_departure_for_the_return_flight() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click on Book button$")
	public void i_click_on_Book_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should be able to see the Total Amount$")
	public void i_should_be_able_to_see_the_Total_Amount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should be able to see the Payment button$")
	public void i_should_be_able_to_see_the_Payment_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Application should get closed$")
	public void application_should_get_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
