package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.trendyol.com");

        Thread.sleep(3000);
        driver.close();

    }
}
