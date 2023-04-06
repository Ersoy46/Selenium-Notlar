package test.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Denemechatgpt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        // 1) kullanıcı https://test-members.rexven.com/service-providers sayfasına gider
        driver.get("https://test-members.rexven.com/service-providers");

        // 2) sayfaya girdiğinde sol tarafda bulunan yol haritası butonuna tıklar
        WebElement navigationButton = driver.findElement(By.cssSelector(".nav-toggle"));
        navigationButton.click();

        // 3) sayfayı aşağıya indirir geri yukarı çıkar
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

        // 4) kullanıcı bilgileri butonuna tıklar Ad Soyad bölümüne ERTUĞRUL ERSOY yazar şifre 12345 yazar
        WebElement loginButton = driver.findElement(By.cssSelector(".login-button"));
        loginButton.click();
        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));
        usernameInput.sendKeys("ERTUĞRUL ERSOY");
        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        passwordInput.sendKeys("12345");

        // 5) Eğitimler butonuna tıklar
        WebElement coursesButton = driver.findElement(By.cssSelector(".courses-button"));
        coursesButton.click();

        // 6) rexven butonuna tıklar ve ana sayfaya döner
        WebElement homeButton = driver.findElement(By.cssSelector(".home-button"));
        homeButton.click();

        // 7) tüm bunları yaparken implicit wait 4000 olsun her sekme arasına implicit wait ekle
        Thread.sleep(3000);

        // WebDriver'ı kapat
        driver.quit();
    }
}