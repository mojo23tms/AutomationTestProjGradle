import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainSelenium {

    protected WebDriver driver;
    protected WebDriverWait waiter;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        this.driver = new ChromeDriver(options);
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
}
