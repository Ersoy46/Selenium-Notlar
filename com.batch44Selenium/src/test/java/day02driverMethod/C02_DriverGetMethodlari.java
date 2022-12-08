package day02driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
    }
}
