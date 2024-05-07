package pages;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HandlingWindowPages extends PageObject {
	private static final Logger logger = LogManager.getLogger(HandlingWindowPages.class);
	@FindBy(css = "a[class='blinkingText']")
	public WebElementFacade blinktext;
	@FindBy(css = "p[class='im-para red']")
	public WebElementFacade redText;
	@FindBy(id = "username")
	public WebElementFacade sorted;
	String parentID;
	String emailID;

	public void selectBlink() {
		// TODO Auto-generated method stub
		blinktext.click();

	}

	public void emailSort() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(7000);

		Set<String> windows = getDriver().getWindowHandles();// [parentid,chid ID]
		Iterator<String> it = windows.iterator();
		System.out.println(windows);
//		String data = it.next();
		
		parentID = it.next();
		String childId = it.next();
		getDriver().switchTo().window(childId);
		logger.info("Switching is done");

		System.out.println(redText.getText());
		emailID = redText.getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);// to split any text

	}

	public void switchingBack() {
		// TODO Auto-generated method stub
		
		getDriver().switchTo().window(parentID);

	}

	public void inputSortedEmail() {
		sorted.sendKeys(emailID);
		// TODO Auto-generated method stub

	}

}
