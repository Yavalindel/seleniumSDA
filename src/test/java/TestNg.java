import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void checkPageTitle() {
        String pageTitle = "";
        String url = "http://automationpractice.com/index.php";
        String expectedTitle = "My Store";

        driver.get(url);

        pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, expectedTitle);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}