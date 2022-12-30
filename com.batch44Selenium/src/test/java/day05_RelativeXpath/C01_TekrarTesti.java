package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {


// https:amazon.com adresine gidiniz
//  browseri tam sayfa açın
//  sayfayı refresh yapin
//  sayfa başlıgının spend less ifadesi içerdiğini test edin
//  Girf Cards sekmesine basın
//  Birhday butonuna basın
//  Best Seller bölümünden ilk ürünü tıklayın
//  Gift Cards details 'den 25$' i seçin
//  Urun ücretinin 25 $ oldugunu test edin
//  sayfayı kapatın

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.amazon.com");
        // driver.manage().window().fullscreen();
        driver.navigate().refresh();

        String actualistenen = driver.getTitle();
        String expentedolan = "Spend less";

        if (actualistenen.contains(expentedolan)) {
            System.out.println("ACTUALİSTENEN PASS");
        } else {
            System.out.println("EXPENTEDOLAN FAİLED");
        }

        WebElement giftcard = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
        giftcard.click();

        WebElement Biryday = driver.findElement(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[3]"));
        Biryday.click();

        WebElement Bestsellerilkurun = driver.findElement(By.xpath("(//a[@class='a-color-base a-link-normal'])[1]"));
        Bestsellerilkurun.click();

        WebElement ellidolar = driver.findElement(By.xpath("//img[@id='gc-mini-picker-design-swatch-image-1']"));
        ellidolar.click();

        WebElement ellitestedildi = driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[2]"));

        String expentedTest = ("ELLİDOLAR");
        String actualtest = ellitestedildi.getText();

        if (expentedTest.equals(actualtest)) {
            System.out.println("ÜRÜN ÜCRETİ 50$ PASS");
        } else {
            System.out.println("ÜRÜN ÜCRETİ 50$ FAİLED");
        }

        Thread.sleep(5000);
        driver.close();


    }
}
