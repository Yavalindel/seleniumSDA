import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Zadanie2 {
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
        driver.findElement(By.login("sign in")).click();
        driver.findElement(By.input id("email_create")).sendKeys("raf@raf.pl");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(input id(id_gender1)).click();
        driver.findElement(input id("customer_firstname")).sendKeys("raf");
        driver.findElement(input id("customer_lastname")).sendKeys("tym");
        driver.findElement(input id("passwd")).sendKeys("LadyLex");
        driver.findElement(input id("address1")).sendKeys("bla,22,BRW");
        driver.findElement(input id("city")).sendKeys("bla");
        Select stateDropdown = new Select(driver.findElement(By.id("id_state"));
        stateDropdown.selectByVisibleText("Iowa");
        driver.findElement(input id("postcode")).sendKeys("22222");
        Select stateDropdown = new Select(driver.findElement(By.id("id_country"));
        stateDropdown.selectByVisibleText("united States");
        driver.findElement(input id("phone_mobile")).sendKeys("666777888");
        driver.findElement(input id("alias")).sendKeys("the same");
        driver.findElement(By.id("SubmitAccount")).click();

        /*driver.findElement(By.id("email")).sendKeys("poczta@poczta.pl");
        driver.findElement(By.id("passwd")).sendKeys("password");
        driver.findElement(By.id("SubmitLogin")).click();
        String title = driver.findElement(By.className("account")).getText();
        Assert.assertEquals("Test User", title);*/
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
