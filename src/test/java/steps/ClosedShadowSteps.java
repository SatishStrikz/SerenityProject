package steps;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import pages.ClosedShadowPage;

public class ClosedShadowSteps extends PageObject {
	ClosedShadowPage closedShadowPage;
	
	@Step("User enters text on Concept test field {string}")
	public void enterText(String text) throws InterruptedException {
		// TODO Auto-generated method stub
		closedShadowPage.entertheText(text);
		
	}
	@Step("User clicks on Go to cart button")
	public void goToCart() throws InterruptedException {
		// TODO Auto-generated method stub
		closedShadowPage.goToCRT();
		
	}
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

	}
