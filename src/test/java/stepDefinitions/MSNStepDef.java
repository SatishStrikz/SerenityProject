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
	@And("User navigate back to parent window")
	public void User_navigate_back_to_parent_window()  {
		msnsteps.switchToParent();
	
	
}
	@Then("User Enter the fetched text in the search field")
	public void User_Enter_the_fetched_text_in_the_search_field() throws InterruptedException {
		msnsteps.inputText();
	
}
	@And("User clicks on the search icon")
	public void User_clicks_on_the_search_icon()  {
		msnsteps.clickSearchIcon();
	}
	@Then("User goes to second child")
	public void user_goes_to_second_child() throws InterruptedException   {
		msnsteps.secondWindow();
		}

	@And("User clicks on see more button")
	public void User_clicks_on_see_more_button()  {
		msnsteps.clickSeeMorebtn();
	}
	}