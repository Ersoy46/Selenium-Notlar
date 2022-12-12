package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement sourcearamTusu=driver.findElement(By.id("twotabsearchtextbox"));
        sourcearamTusu.click();

    }
}
