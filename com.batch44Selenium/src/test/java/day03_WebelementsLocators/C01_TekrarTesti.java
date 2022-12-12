package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //yeni bir class oluşturun
        driver.navigate().to("https://youtube.com");

        //youtube sayfasına gidelim ve sayfa başlıgının "youtube" olu olmadıgını dogrulayın
        //eger değilse dogru başlıgı konsolda yazdırın


    }
}
