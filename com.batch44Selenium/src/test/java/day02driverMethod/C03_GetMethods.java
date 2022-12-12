package day02driverMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//yeni bir package oluşturlaım
//c03_GetMethod olsun
//amazon sayfasına gidelim https://www.amazon.com
        driver.get("https://www.amazon.com/");
//sayfa başşlıgını yazdırın
        System.out.println("driver.getTitle()");
//sayfa başlıgının amazon içerdiğini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASS");
        } else {
            System.out.println("TİTLE TESTİ FAİLED");
        }
//sayfa adresini(url) yazdırın
        System.out.println(driver.getCurrentUrl());
//sayfa url'sinin amazon içerdigini kontrol edin
        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "amazon";
        if (actualUrl.contains(arananUrl)) {
            System.out.println("Url testi PASS");

        } else {
            System.out.println("url testi failed");

        }
//sayfa handle değerini yazdırın
        System.out.println(driver.getWindowHandle());
//sayfa HTML kodlarında "alışveriş" kelimesi geçtigini test edin
        String actualpagesource = driver.getPageSource();
        String pagearanankelime = "alışveriş";
        if (actualpagesource.contains(pagearanankelime)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAİLED");
        }
//sayfayı kapatın
        driver.close();

    }
}
