import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void doLogin() {
        String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys("poczta@poczta.pl");
        driver.findElement(By.id("passwd")).sendKeys("password");
        driver.findElement(By.id("SubmitLogin")).click();
        String title = driver.findElement(By.className("info-account")).getText();
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", title);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}