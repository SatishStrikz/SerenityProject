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
	@Step("User switch back to child window")
	public void switchWindow() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.switchToChild();
		
	}
	@Step("User gets the text from child window to parent window")

	public void getText() throws InterruptedException {
		// TODO Auto-generated method stub
		msnHomePage.getTheText();
		
	}

	}
