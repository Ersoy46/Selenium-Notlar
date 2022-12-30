package Day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {


        // http://zero.webappsecurity.com adresine gidin.
// Signin butonuna tıklayın
// Login alanına "usarname" yazdırın
//Signin butonuna tıklayınm
//pay bills sayfasına gidiniz
//amount kismina yatırmak istediginiz herhangi bir miktarı yazın
//tarih kısmına 2020-09-10 yazdırın
//pay buttonuna tıklayın
//"The Payment war submitted" mesajının cıktıgını kontrol edin

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.xpath("//button[@class='signin btn btn-info']")).click();

WebElement username=driver.findElement(By.xpath("//input[@id='user_login']"));
WebElement PASWORD= driver.findElement(By.xpath("//input[@id='user_password']"));

username.sendKeys("username");
PASWORD.sendKeys("1234");
driver.findElement(By.className("submit")).submit();



    }
}
