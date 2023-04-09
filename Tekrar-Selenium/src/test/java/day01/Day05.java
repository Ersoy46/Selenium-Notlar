package day01;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05 {
    public static void main(String[] args) throws InterruptedException {

        /*
        YOUTUBE ANA SAYFASINA GİDİN
        AMAZON SAYFASINA GİDELİM
        TEKRAR YOUTUBE SAYFASINA DÖNELİM
        YENİDEN AMAZON SAYFASINA DÖNELİM
        SAYFAYI REFRESH YAPIP YENİLE
        TÜM SAYFAYI KAPATALIM

         */

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com");

        driver.get("https://www.amazon.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.quit();


    }
}
