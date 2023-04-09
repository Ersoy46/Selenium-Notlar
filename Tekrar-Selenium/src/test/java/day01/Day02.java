package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        driver.get("https://www.rexven.com");
// ***
        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());

// ***
        Thread.sleep(3000);

        driver.close();

    }
}
