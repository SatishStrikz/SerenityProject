package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import steps.MSNSteps;

public class MSNStepDef extends PageObject {
	@Steps
	MSNSteps msnsteps;
	@Given("User is landed on the home page of MSN")
	public void user_is_landed_on_the_home_page_of_MSN() {
	   open();
	}

	@And("User clicks on notification icon")
	public void user_clicks_on_notification_icon() throws InterruptedException {
		msnsteps.clickbellicon();
	    
	}
//
//	@Then("User sort the email id from the red text")
//	public void user_sort_the_email_id_from_the_red_text() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		windowhandlingsteps.sortEmail();
//	}
//
//	@Then("User switch back to parent window")
//	public void user_switch_back_to_parent_window() {
//		windowhandlingsteps.switchBack();
//	}
//
//	@Then("pass the sorted email ID")
//	public void pass_the_sorted_email_id() {
//		windowhandlingsteps.inputSorted();
//	    
//	}

}
