package Deneme_Giris_Rexven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Rexven_Deneme02 {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();


    }


    //https://www.rexven.com adresine gidin
    //Sayfa URL sinin https://community.rexven.com/ a esit olduğunu test edin.
    //Rexven logosunun görüntülendiğini test edin.
    // sayfa üstünde bulunan telefon numarasına tıklayın çalıştıgını kontrol edin
    //Burada 4 saniye bekle ve tıklandığını görelim




    @Test
    public void Test01() throws InterruptedException {
        //https://www.rexven.com adresine gidin
        driver.get("https://www.rexven.com/");

        //Sayfa URL sinin https://community.rexven.com/ a esit olduğunu test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://community.rexven.com/";

        Assert.assertEquals("Lütfen test değerlerini gözden geçiriniz", expectedUrl, actualUrl);

        //Rexven logosunun görüntülendiğini test edin.
        WebElement logo = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-image-8492']"));
        // Assert.assertTrue("Logo görünmüyor", logo.isDisplayed()); //mesaj exception fırlattığında görünür.


        //  sayfa üstünde bulunan telefon numarasına tıklayın çalıştıgını kontrol edin

        driver.findElement(By.xpath("//span[@class='elementor-icon-list-text'][1]")).click();

        //Burada 4 saniye bekle ve tıklandığını görelim
        Thread.sleep(4000);

    }
    @After
    public void teardown(){

        driver.close();
    }
}




