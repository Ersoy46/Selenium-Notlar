package Day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {

        //    WebDriverManager.chromedriver().setup();
        //  WebDriver driver=new ChromeDriver();

        //https://www.google.com adresine gidiniz.
        //cookies uyarısını kabul ederek kapatın
        //sayfa başlıgının "Google" ifadesi içerdiğini test edin
        //Arama çubuguna "Nutella" yazıp aratın
        //Bulunan sonuç sayısını yazdırın.
        //sonuç sayısının 10 milyondan fazla oldugunu test edin
        //sayfayi kapatın


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        WebElement baslıkgoogle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));

        String actualbaslık = driver.getTitle();
        String expendengoogle = "Google";

        if (actualbaslık.contains(expendengoogle)) {
            System.out.println("sayfa başlıgı PASS");
        } else {
            System.out.println("sayfa başlıgı  FAİLED");
        }
        WebElement aramacubugu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramacubugu.sendKeys("Nutella" + Keys.ENTER);

        WebElement sonucsayisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucsayisi.getText());



        Thread.sleep(5000);
        driver.close();
    }


}

