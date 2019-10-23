import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooSearch {

    WebDriver driver;

    @AfterSuite
    public void closingAfterSuite() {
        driver.close();

    }

    @Test
    public void testName00001() {
        System.setProperty("webdriver.gecko.driver", "/Users/aleksandrbelski/IdeaProjects/sepJavaTestNG/src/test/recources/drivers/geckodriver");

        openingBrowser();
        navigateToYahoo();
        typeSearchText();
        clickMagnifierButton();
        waitingForPageLoading();
        assertResultsPage();
    }

    private void assertResultsPage() {
        WebElement paginationAtBottom = driver.findElement(By.className("compPagination"));
        boolean isDisplayed = paginationAtBottom.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(isDisplayed, expected);
    }

    private void waitingForPageLoading() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    private void clickMagnifierButton() {
        String magnifier = "#uh-search-button";
        driver.findElement(By.cssSelector(magnifier)).click();
    }


    private void typeSearchText() {
        String selector = "#uh-search-box";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys("portnov school");
    }



    private void navigateToYahoo() {
        driver.get("https://yahoo.com");
    }

    private void openingBrowser() {
        driver= new FirefoxDriver();

    }
}
