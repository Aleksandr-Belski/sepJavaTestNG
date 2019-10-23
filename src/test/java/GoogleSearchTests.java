import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTests {
    WebDriver driver;
    String resultStatsID = "resultStatsID";

    @AfterSuite
    public void afterSuite() {
        driver.quit();


    }


    @Test
    public void test00001() {

        System.setProperty("webdriver.gecko.driver", "/Users/aleksandrbelski/IdeaProjects/sepJavaTestNG/src/test/recources/drivers/geckodriver");


        openBrowser();
        navigateToMainPage ();
        typeQuery();
        submitSearch();
        waitForResultsElement ();
        assertResultsPage();
    }

    private void waitForResultsElement() {
        By elementToWait = By.id(resultStatsID);
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        webDriverWait.until(condition);

    }

    private void assertResultsPage() {

        WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));

        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(isDisplayed, expected);

    }

    private void submitSearch() {
        String selector = ".gLFyf";
        driver.findElement(By.cssSelector(selector)).submit();

    }

    private void typeQuery() {
        String selector = ".gLFyf";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys("portnov computer school");
    }


    private void navigateToMainPage() {
        String url = "https://www.google.com";
        driver.get(url);
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


}
