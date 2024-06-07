package pages;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ClosedShadowPage extends PageObject {

    @FindBy(css = "#userName")
    public WebElement Host1;

    @FindBy(css = ".ud-heading-xl.clp-lead__title.clp-lead__title--small")
    public WebElement pageHeading;

    public void entertheText(String text) throws InterruptedException {
        Thread.sleep(1000);
        SearchContext shadow = Host1.getShadowRoot();
		Thread.sleep(1000);
		WebElement host =shadow.findElement(By.cssSelector("#concepts"));
        host.click();
        Actions act = new Actions(getDriver());
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(5000);
        act.sendKeys(text).perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);
        act.click().perform();
    }

    
	public void goToCRT() {
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childId = it.next();
        getDriver().switchTo().window(childId);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(pageHeading));
        String heading =pageHeading.getText();
        System.out.println(heading);
        Assert.assertEquals(heading, "XPath, CSS Selector, Web,DOM, SelectorsHub & TestCase Studio");
        
    }
}
