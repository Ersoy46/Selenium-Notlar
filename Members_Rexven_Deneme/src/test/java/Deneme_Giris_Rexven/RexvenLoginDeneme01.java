package Deneme_Giris_Rexven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class RexvenLoginDeneme01 {
    WebDriver driver = Driver.getDriver();

    @Test
    public void test() throws InterruptedException {
        driver.get("https://test-members.rexven.com/service-providers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement emailbutton=driver.findElement(By.xpath("//input[@id='email']"));
        emailbutton.sendKeys("tugrul121463@gmail.com");
        Thread.sleep(2000);

        WebElement passwordbutton=driver.findElement(By.xpath("//input[@id='password']"));
        passwordbutton.sendKeys("Ersoy210417");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);
    }

    @AfterTest
    public void cleanup() {

        driver.close();
    }
}
