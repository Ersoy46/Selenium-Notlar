package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_RadioButton {

    //https://www.facebook.com adresine gidin.
    //Cookies i kabul edin.
    //"radio buttons" elementlerini locate edin.
    //Seçili değilse cinsiyet bölümüde size uygun olanı seçin.

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test01(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement radiobutton= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        radiobutton.click();
    }

@After
    public void teardown(){
        driver.close();

}



}
