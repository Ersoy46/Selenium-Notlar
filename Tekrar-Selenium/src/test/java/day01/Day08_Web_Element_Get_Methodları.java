package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day08_Web_Element_Get_Methodları {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement AmazonAramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        AmazonAramaKutusu.sendKeys("city bike" + Keys.ENTER);

        WebElement sonucyazisi= driver.findElement(By.className("sg-col-inner"));
        System.out.println("sonuc yazisi çıktısı"  +  sonucyazisi.getText());

        WebElement ilkUrunResmi= driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();

        driver.close();
    }
}

