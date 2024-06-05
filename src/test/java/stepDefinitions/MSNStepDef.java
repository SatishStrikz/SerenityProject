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

	@Then("User clicks on the top story link")
	public void User_clicks_on_the_top_story_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		msnsteps.clickLink();
	}

	@Then("User switch  to child window")
	public void user_switch_to_child_window() throws InterruptedException {
		msnsteps.switchWindow();
	}

	@Then("User gets the text from child window to parent window")
	public void text_from_child_window_to_parent_window() throws InterruptedException {
		msnsteps.getText();
	    
	}

}
