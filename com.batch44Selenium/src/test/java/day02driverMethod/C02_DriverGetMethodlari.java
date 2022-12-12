package day02driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


    }
}
