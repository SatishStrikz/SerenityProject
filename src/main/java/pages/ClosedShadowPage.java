package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClosedShadowPage extends PageObject {
	//private static final Logger logger = LogManager.getLogger(MSNHomePage.class);
	@FindBy(css = "//fluent-design-system-provider")
	public WebElementFacade notificationIcon;
	@FindBy(css = "#userName")
	public WebElementFacade Host1;
	@FindBy(css = "p[class='im-para red']")
	public WebElementFacade redText;
	@FindBy(id = "username")
	public WebElementFacade sorted;
	String parentID;
	String emailID;

	public void entertheText(String Text) throws InterruptedException {
		//This Element is inside single shadow DOM.
		//String cssSelectorForHost1 = "#userName";
		Thread.sleep(1000);
		SearchContext shadow = Host1.getShadowRoot();
		Thread.sleep(1000);
		WebElement host =shadow.findElement(By.cssSelector("#concepts"));
		
		host.click();
		Actions act = new Actions(getDriver());
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Text).perform();
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		act.click().perform();// TODO Auto-generated method stub
		
//		    waitForCondition().until(
//		        ExpectedConditions.elementToBeClickable(notificationIcon)
//		    );
		
//WebElement element= getDriver().findElement(By.xpath("//fluent-design-system-provider")).
//findElement(By.cssSelector("entry-point[instance-id='EntryPointHpWC']")).getShadowRoot().
//		findElement(By.cssSelector("homepage-header[config-instance-src='default']")).getShadowRoot().
//		findElement(By.cssSelector("notification-bell[instance-id='NotificationBellWC']")).getShadowRoot().
//		findElement(By.cssSelector("div#notificationBell"));
//Thread.sleep(3000);
//element.click();		

	}

//	public void emailSort() throws InterruptedException {
//		// TODO Auto-generated method stub
//		Thread.sleep(7000);
//
//		Set<String> windows = getDriver().getWindowHandles();// [parentid,chid ID]
//		Iterator<String> it = windows.iterator();
//		System.out.println(windows);
////		String data = it.next();
//		
//		parentID = it.next();
//		String childId = it.next();
//		getDriver().switchTo().window(childId);
//		logger.info("Switching is done");
//
//		System.out.println(redText.getText());
//		emailID = redText.getText().split("at")[1].trim().split(" ")[0];
//		System.out.println(emailID);// to split any text
//
//	}
//
//	public void switchingBack() {
//		// TODO Auto-generated method stub
//		
//		getDriver().switchTo().window(parentID);
//
//	}
//
//	public void inputSortedEmail() {
//		sorted.sendKeys(emailID);
//		// TODO Auto-generated method stub
//
//	}

}
