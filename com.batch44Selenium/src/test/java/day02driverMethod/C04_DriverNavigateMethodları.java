package day02driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodları {
    public static void main(String[] args) {
        System.setProperty("webriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");


        driver.navigate().to("https://www.techproeducation.com");

    }
}
