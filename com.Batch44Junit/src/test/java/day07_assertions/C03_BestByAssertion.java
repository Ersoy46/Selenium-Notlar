package day07_assertions;

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

public class C03_BestByAssertion {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    @Test
    public void Test01(){
        //https://www.bestbuy.com/ adresine gidin
        driver.get("https://www.bestbuy.com/");

        //Sayfa URL sinin https://www.bestbuy.com/ a eşit olduğunu test edin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.bestbuy.com/";

        Assert.assertEquals("Lütfen test değerlerini gözden geçiriniz",expectedUrl,actualUrl);

        //Sayfa başlığının "Rest" içermediğini test edin.
        String actualBaslik= driver.getTitle();
        String istenmeyenKelime="Rest";

        Assert.assertFalse(actualBaslik.contains(istenmeyenKelime));


        //BestBuy logosunun görüntülendiğini test edin.
        WebElement logo= driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue("Logo görünmüyor", logo.isDisplayed()); //mesaj exception fırlattığında görünür.

        //Fransızca linkin görüntülendiğini test edin.
        WebElement francais= driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue(francais.isDisplayed());
    }
    @After
    public void teardown(){
        //driver.close();
    }
}