import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid03 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setPlatform(Platform.WINDOWS);

        cap.setBrowserName("chrome");

        cap.setVersion("108.0.5359.125");
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);


        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), new ChromeOptions());

        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandles());
        Thread.sleep(3000);
        driver.close();
    }
}
