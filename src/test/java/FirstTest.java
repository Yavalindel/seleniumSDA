import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");

        String pageTitle = "";
        String url = "http://automationpractice.com/index.php";
        String expectedTitle = "My Store";
        WebDriver driver = new FirefoxDriver();

        driver.get(url);

        pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, expectedTitle);
        driver.quit();
    }
}