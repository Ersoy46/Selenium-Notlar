package Day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {
    public static void main(String[] args) {
        //amazon sayfasına gidelim
        //arama kutusunu locate edelim
        //samsung headphones ile arama yapalım
        //bulunan sonuc sayısını yazdırıalım
        //ilk ürüne tıklayalım
        //bir önceki sayfaya dönüp sayfadaki tüm başlıkları yazdıralım


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");

        WebElement aramakutusulocate = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusulocate.sendKeys("samsung headphones" + Keys.ENTER);
     //aramakutusulocate.submit();

        WebElement sonucyazisi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucyazisi.getText());

        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();

        driver.navigate().back();

        List<WebElement> baslıklarlistesi = driver.findElements(By.xpath("(//span[@class='a-size-base a-color-base'])[4]"));

        System.out.println(baslıklarlistesi.size());

        driver.close();
    }


}
