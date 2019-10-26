import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Zadanie1 {
    public WebDriver driver;
    private List<WebElement> dress;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @Test
    public void doLogin() {
        String url = "http://automationpractice.com/index.php";
        driver.get(url);
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();
        dress = driver.findElements(By.xpath("//div[@class='product-image-container']"));
        System.out.println(dress.size());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}