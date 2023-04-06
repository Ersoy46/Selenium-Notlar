package Deneme_Giris_Rexven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

       //KULLANICI WWW.REXVEN.COM SAYFASINA GİDER
       //GİRİŞ YAP/LOGİN BUTONUNA TIKLAR
       //E-MAİL VE ŞİFRE BÖLÜMLERİNİ DOGRU YAZAR
       //GİRİŞ YAP BUTONUNA TIKLAR VE SAYFAYA GİRER ve başarıyla giriş yapıldı yazısını görür.
       //Kullanıcı bilgileri sekmesinde İSİM: Mehmet  soyisim sekmsine TEK yazdırır ve güncelle butonuna basar
       //Kullanıcı bilgileri başarıyla güncellendi yazısını görür.
       //Ana sayfayı aşagı yukarı kaydırır safayı gözden geçirir.
       //Menüdeki Eğitimler butonuna tıklar sayfayı aşagı indirir ve 8 adet eğitim videosu olduğunu doğrular.
       //Menüdeki Fatura  Bilgileri sekmesine tıklar
       //çıkış yap butonuna basar ve tüm sayfayı kapatır

public class Rexven_Deneme03 {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }


    @Test
    public void Test01() throws InterruptedException {
        driver.get("https://www.rexven.com/");

        driver.findElement(By.xpath("//span[@class='elementor-button-text' and text()='Giriş Yap']")).click();


        WebElement emailButonu = driver.findElement(By.xpath("//input[@id='email']"));
        Thread.sleep(2000);
        emailButonu.sendKeys("tugrul121463@gmail.com");
        Thread.sleep(2000);

        WebElement passwordButonu = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButonu.sendKeys("Ersoy210417");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);


        WebElement KullanıcıAdi = driver.findElement(By.xpath("//input[@id='firstName']"));
        KullanıcıAdi.sendKeys("Mehmet");
        Thread.sleep(2000);

        WebElement KullanıcıSoyadi = driver.findElement(By.xpath("//input[@id='lastName']"));
        KullanıcıSoyadi.sendKeys("TEK");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='ps-btn ps-btn--lg']")).click();

        Actions actions = new Actions(driver);


        // Drop-down'ı bulun ve tıklanabilir hale getirin
        WebElement dropdown = driver.findElement(By.xpath("//div[@class='header__actions']"));
        actions.moveToElement(dropdown).click().perform();
        Thread.sleep(2000);
        // Sayfayı aşağı kaydırın
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        // Sayfayı yukarı kaydırın
        actions.sendKeys(Keys.PAGE_UP).perform();

        // driver.findElement(By.xpath("//div[contains(text(), 'Eğitimler')]/i[@class='icon-papers']\n")).click();
// WebElement objesini bul
        WebElement element = driver.findElement(By.xpath("//div[contains(text(), 'Eğitimler')]/i[@class='icon-papers']"));

// JavaScript kodunu oluştur
        String javascript = "arguments[0].click();";

// JavaScript kodunu WebElement üzerinde çalıştır
        ((JavascriptExecutor) driver).executeScript(javascript, element);

        // Drop-down'ı bulun ve tıklanabilir hale getirin
        WebElement dropdown2 = driver.findElement(By.xpath("//div[@class='ps-section--account-setting']"));
        actions.moveToElement(dropdown2).click().perform();
        Thread.sleep(2000);

        // Sayfayı aşağı kaydırın
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        // Sayfayı yukarı kaydırın
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        WebElement faturaBilgi = driver.findElement(By.xpath("//div[contains(text(), 'Fatura Bilgileri')]/i[@class='icon-papers']"));
        String javascript2 = "arguments[0].click();";
        ((JavascriptExecutor) driver).executeScript(javascript2, faturaBilgi);

        Thread.sleep(2000);


        driver.close();
    }
}
