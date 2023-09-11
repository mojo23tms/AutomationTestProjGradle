import com.microsoft.playwright.BrowserType;
import io.github.uchagani.jp.BrowserConfig;
import io.github.uchagani.jp.PlaywrightBrowserConfig;

public class MainPlaywright implements PlaywrightBrowserConfig {


    @Override
    public BrowserConfig getBrowserConfig() {
        return new BrowserConfig()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
    }
}
