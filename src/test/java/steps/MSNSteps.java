package steps;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import pages.MSNHomePage;

public class MSNSteps extends PageObject {
	MSNHomePage msnHomePage;
	
	@Step("User cilck notification bell")
	public void clickbellicon() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.clickbell();
//		
	}
	@Step("User clicks on the top story link")
	public void clickLink() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.selectLink();
		
	}
	@Step("User switch  to child window")
	public void switchWindow() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.switchToChild();
		
	}
	@Step("User gets the text from child window to parent window")

	public void getText() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.getTheText();
		
	}
	@Step("User navigate back  to parent  window")

	public void switchToParent()  {
		// TODO Auto-generated method stub
		msnHomePage.switchBackToParent();
		
	}
	@Step("User Enter the fetched text in the search field")

	public void inputText() throws InterruptedException  {
		// TODO Auto-generated method stub
		msnHomePage.enterTextInSearch();
		
	}
	@Step("User Clicks on the search icon")

	public void clickSearchIcon()   {
		// TODO Auto-generated method stub
		msnHomePage.clickSearch();
		
	}
	@Step("User goes to second child window")

	public void secondWindow() throws InterruptedException   {
		// TODO Auto-generated method stub
		msnHomePage.secondChild();
		
	}
	@Step("User Clicks on the see more button")

	public void clickSeeMorebtn()   {
		// TODO Auto-generated method stub
		msnHomePage.clickSeeMore();
		
	}
	
	

	}
