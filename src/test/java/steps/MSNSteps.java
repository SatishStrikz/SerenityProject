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
//	}
//	@Step("User sort the email")
//	public void sortEmail() throws InterruptedException {
//		// TODO Auto-generated method stub
//		windohandlingpages.emailSort();
//		
//	}
//	@Step("User switch back to parent window")
//	public void switchBack() {
//		// TODO Auto-generated method stub
//		windohandlingpages.switchingBack();
//		
//	}
//	@Step("User input sorted")
//
//	public void inputSorted() {
//		// TODO Auto-generated method stub
//		windohandlingpages.inputSortedEmail();
//		
//	}

	}}
