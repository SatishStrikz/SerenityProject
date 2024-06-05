package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MSNHomePage extends PageObject {
	// private static final Logger logger = LogManager.getLogger(MSNHomePage.class);
	@FindBy(xpath = "//fluent-design-system-provider")
	public WebElementFacade notificationIcon;
	@FindBy(css = "entry-point[instance-id='EntryPointHpWC']")
	public WebElementFacade entry;
	@FindBy(css = "p[class='im-para red']")
	public WebElementFacade redText;
	@FindBy(id = "username")
	public WebElementFacade sorted;
	String parentID;
	String emailID;

	public void clickbell() throws InterruptedException {
		// TODO Auto-generated method stub

//		    waitForCondition().until(
//		        ExpectedConditions.elementToBeClickable(notificationIcon)
//		    );

		WebElement element = notificationIcon.findElement(By.cssSelector("entry-point[instance-id='EntryPointHpWC']"))
				.getShadowRoot().findElement(By.cssSelector("homepage-header[config-instance-src='default']"))
				.getShadowRoot().findElement(By.cssSelector("notification-bell[instance-id='NotificationBellWC']"))
				.getShadowRoot().findElement(By.cssSelector("div#notificationBell"));
		Thread.sleep(3000);
		element.click();

	}

	public void selectLink() throws InterruptedException {
		// This Element is inside 3 nested shadow DOM.
		// This Element is inside 3 nested shadow DOM.

		Thread.sleep(1000);
		WebElement link = getDriver().findElement(By.xpath("//fluent-design-system-provider"))
				.findElement(By.cssSelector("entry-point[instance-id='EntryPointHpWC']")).getShadowRoot()
				.findElement(By.cssSelector("homepage-header[config-instance-src='default']")).getShadowRoot()
				.findElement(By.cssSelector("notification-bell[instance-id='NotificationBellWC']")).getShadowRoot()
				.findElement(By.cssSelector("div#notificationBell"))
				.findElement(By.cssSelector("div[class='notification-item_content notification-item_content_3col']"));
		Thread.sleep(3000);

		link.click();
	}
	/*
	 * .findElement(By.cssSelector("entry-point[config-instance-src='default']"))
	 * .getShadowRoot() .findElement(By.cssSelector(
	 * "msn-homepage-header[data-t='{'n':'CommonHeader','t':8}']")) .getShadowRoot()
	 * .findElement(By.cssSelector(
	 * "notification-bell[config-instance-src='default']")) .getShadowRoot()
	 */

	public void switchToChild() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);

		Set<String> windows = getDriver().getWindowHandles();// [parentid,chid ID]
		Iterator<String> it = windows.iterator();
		System.out.println(windows);
//		String data = it.next();

		parentID = it.next();
		String childId = it.next();
		getDriver().switchTo().window(childId);

	}

public void getTheText() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(3000);
	String cssSelectorForHost1 = "body > fluent-design-system-provider:nth-child(7) > entry-point-views:nth-child(1) > consumption-feed-wc:nth-child(1) > fluent-design-system-provider:nth-child(1) > div:nth-child(1) > div:nth-child(2) > consumption-page:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > views-header-wc:nth-child(1)";
	Thread.sleep(1000);
	SearchContext shadow = getDriver().findElement(By.cssSelector("body > fluent-design-system-provider:nth-child(7) > entry-point-views:nth-child(1) > consumption-feed-wc:nth-child(1) > fluent-design-system-provider:nth-child(1) > div:nth-child(1) > div:nth-child(2) > consumption-page:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > views-header-wc:nth-child(1)")).getShadowRoot();
	Thread.sleep(1000);
	WebElement shadowText=shadow.findElement(By.cssSelector(".viewsHeaderText"));
	System.out.println(shadowText.getText());
}}
//	WebElement text = getDriver().findElement(By.xpath("//fluent-design-system-provider[@direction='ltr']")).getShadowRoot()
//			
//			.findElement(By.cssSelector("entry-point-views:nth-child(1)"))
//			.getShadowRoot().findElement(By.cssSelector("consumption-feed-wc:nth-child(1)"))
//			.getShadowRoot().findElement(By.cssSelector("h1[class='viewsHeaderText']"));
//	Thread.sleep(3000);
//	
//	String Caught = text.getText();
//	System.out.println(Caught);
	
//	This Element is inside single shadow DOM.
	



//	public void switchingBack() {
//		// TODO Auto-generated method stub
//		
//		getDriver().switchTo().window(parentID);
//
//	}

//	public void inputSortedEmail() {
//		sorted.sendKeys(emailID);
//		// TODO Auto-generated method stub
//
//	}
