package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

          /*
            youtube web sayfasına gidin ve sayfa başlıgının "youtube" olup olmadıgını dogrulayın
            2-)sayfa URL'sinin "youtube" içerip içermedigini kntrol edin, içermiyorsa dogru url yi yazdırn
            3-) daha sonra Amazon safasına gidin
            4-)Yotube sayfasına geri dönün
            5-)sayfayı yenileyin
            6-)Amazon sayfasına geri dönün
            7-)sayfayı tam sayfa yapın
            8-)ardından sayfa başlıgının "Amazon" içermedigini(contains) dogrulayın, Yoksa doru başlığı yazdırın
            9-)sayfa URL'sinin https://www.amazon.com olup olmadıgını dogrulayın, değilse dogru url'yi yazdırın
            10-)sayfayı kapatın


          */
public class Day06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";

        if (actualTitle.equals(expectedTitle))
        {

            System.out.println("sayfa başlıgı PASS");
        }
        else {
            System.out.println("sayfa başlıgı FAİLED");

        }

        String actualURL=driver.getCurrentUrl();
        String expectedURL="youtube";

        if (actualURL.contains(expectedURL)){
            System.out.println("URL TESTİ PASSED");

        }
       else {
            System.out.println("URL TESTİ FAİLED");

        }
    }

}
