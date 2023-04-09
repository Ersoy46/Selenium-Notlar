package day01;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03 {

    /*AMAZON SAYFASINA GİDELİM
    SAYFA BAŞLIGINI (TİTLE) YAZDIR
    SAYFA BAŞLIGININ AMAZON İÇERDİGİNİ TEST EDİN
    SAYFA ADRESİNİN (URL) YAZDIRIN
    SAYFA URL'SİNİN "AMAZON" İÇERDİGİNİ TEST EDİN
    SAYFA HANDLE DEĞERİNİN YAZDIRIN
    SAYFA HTML KODLARINAD "ALIŞVERİŞ" KELİMESİ GEÇİGİNİ TEST EDN
    SAYFAYI KAPAT
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");

        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";

        actualTitle.contains(arananKelime);

        System.out.println(driver.getCurrentUrl());

        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "amozon.com";

        actualUrl.contains(arananUrl);

        System.out.println(driver.getWindowHandle());

        String actualPage = driver.getPageSource();
        String arananPage = "alışveriş";

        actualPage.contains(arananPage);
        System.out.println(driver.getPageSource());

        driver.close();


    }
}
