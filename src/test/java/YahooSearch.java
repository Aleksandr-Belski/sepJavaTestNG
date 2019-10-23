import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooSearch {



    @Test
    public void testName00001() {
        System.setProperty("webdriver.gecko.driver", "/Users/aleksandrbelski/IdeaProjects/sepJavaTestNG/src/test/recources/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://yahoo.com");


    }
}
