package Day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.Duration;

public class C02_Arama_Testi {
    public static void main(String[] args) {

        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://saucedemo.com adresine gidiniz.
        driver.get("https://www.saucedemo.com");
        //USERNAME KUTUSUNA "standard_user" yazdırın
        WebElement usernamekutusu= driver.findElement(By.id("user-name"));
        usernamekutusu.sendKeys("standard_user");

        //Pasvord kutusuna "secret_sauce" yazdırın
        WebElement passwordkutusu= driver.findElement(By.xpath("//input[@id='password']"));
        passwordkutusu.sendKeys("secret_sauce");
        //login tuşuna basın
        driver.findElement(By.id("login-button")).click();

        //ilk ürünün adını kaydedin ve bu ürünün sayfasına gidin.
        WebElement ilkurun= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
      String ilkurunismi=ilkurun.getText();
        ilkurun.click();
        //Add to card butonuna basınız
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //Alışveriş sepetine tıklayın
        driver.findElement(By.className("shopping_cart_link")).click();
        //Seçtiğiniz ürünün başarılı olarak sepete eklendiğini kontrol edin.
        WebElement sepetkontrol= driver.findElement(By.xpath("//div[@class='cart_quantity']"));
        String sepetismi=sepetkontrol.getText();

        if (sepetismi.equals(sepetkontrol)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }
        //sayfayı kapatın...

        driver.close();



        }

    }
//bir package oluşturlaım
//tMethod olsun
// sayfasına gidelim https://www.amazon.com
//driver.get("https://www.amazon.com/");
//başşlıgını yazdırın
//System.out.println("driver.getTitle()");
//başlıgının amazon içerdiğini test edin
//String actualTitle = driver.getTitle();
//String arananKelime = "Amazon";
//if (actualTitle.contains(arananKelime)){
//    System.out.println("Title testi PASS");
//}else{
//    System.out.println("TİTLE TESTİ FAİLED");
//}
//adresini(url) yazdırın
//System.out.println(driver.getCurrentUrl());
//url'sinin amazon içerdigini kontrol edin
//String actualUrl=driver.getCurrentUrl();
//String arananUrl="amazon";
//if (actualUrl.contains(arananUrl)){
//    System.out.println("Url testi PASS");

//}else{
//    System.out.println("url testi failed");

//}
//handle değerini yazdırın
//System.out.println(driver.getWindowHandle());
//HTML kodlarında "alışveriş" kelimesi geçtigini test edin
//String actualpagesource=driver.getPageSource();
//String pagearanankelime="alışveriş";
//if (actualpagesource.contains(pagearanankelime)){
//    System.out.println("PASS");
//}else{
//    System.out.println("FAİLED");
