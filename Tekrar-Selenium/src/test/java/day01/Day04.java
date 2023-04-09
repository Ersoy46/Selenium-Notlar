package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.hepsiburada.com");

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        driver.navigate().to("https://rexven.com");

        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();
    }
}
