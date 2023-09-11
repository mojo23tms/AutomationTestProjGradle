package selenium;

import com.microsoft.playwright.Page;
import io.github.uchagani.jp.UseBrowserConfig;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.*;

@UseBrowserConfig(MainPlaywright.class)
public class BaseTestsSelenium extends MainSelenium {

    @Test
    public void test_herokuPractice() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

    @Test
    public void test_herokuPractice1() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

    @Test
    public void test_herokuPractice2() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

    @Test
    public void test_herokuPractice3() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

    @Test
    public void test_herokuPractice4() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

    @Test
    public void test_herokuPractice5() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }
    @Test
    public void test_herokuPractice6() {
        driver.get("https://the-internet.herokuapp.com/login");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='username']"))).sendKeys("tomsmith");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[name='password']"))).sendKeys("SuperSecretPassword!");
        waiter.until(ExpectedConditions.elementToBeClickable(cssSelector("[type='submit']"))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(cssSelector(".flash.success")));
    }

}
