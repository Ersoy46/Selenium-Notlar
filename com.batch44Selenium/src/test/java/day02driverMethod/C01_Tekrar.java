package day02driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        //normalde selenium'un kendi ide si var. fakat biz daha kullanışlı oldugu için intellije kullanıyoruz.

        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        driver.close();

    }
}
