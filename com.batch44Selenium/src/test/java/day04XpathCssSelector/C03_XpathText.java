package day04XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XpathText {
    public static void main(String[] args) {
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //Add element butonuna basın
        //Delete butonunun görünür oldugunu test edin.
        //DeLete tuşuna basın.
        //Add/remove elements yazısınız görünür oldugunu test edin.

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addtusubas = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addtusubas.click();
        WebElement deletegörünür = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deletegörünür.isDisplayed()) {
            System.out.println("delete butonu görünüyor PAAS");
        } else {
            System.out.println("FAİLED");
        }

        deletegörünür.click();
        WebElement addyazisi = driver.findElement(By.xpath("//h3"));
        WebElement addyazisi2 = driver.findElement(By.tagName("h3"));

        if (addyazisi.isDisplayed()) {
            System.out.println("delete butonu görünüyor PAAS");
        } else {
            System.out.println("FAİLED");

        }
    }
}