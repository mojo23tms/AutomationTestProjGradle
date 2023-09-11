import com.microsoft.playwright.Page;
import io.github.uchagani.jp.UseBrowserConfig;
import org.junit.jupiter.api.Test;

@UseBrowserConfig(MainPlaywright.class)
public class BaseTestsPlaywright extends MainPlaywright {

    @Test
    public void test_herokuPractice(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice1(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice2(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice3(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice4(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice5(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice6(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice7(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }

    @Test
    public void test_herokuPractice8(Page page) {
        page.navigate("https://the-internet.herokuapp.com/login");
        page.type("[name='username']", "tomsmith");
        page.type("[name='password']", "SuperSecretPassword!");
        page.click("[type='submit']");
        page.waitForSelector(".flash.success");
    }
}
