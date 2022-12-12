package day02driverMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethod {
    public static void main(String[] args) {

        //yeni bir calss oluşturun
        //youtube anasayfasına gidin
        //amazon sayfasına gidin
        //tekrar youtube sayfasına dönelim
        //yeniden amazon sayfasına dönelim
        //sayfayı refresh yapalım
        //sayfayı tam ekran yapalım
        //tüm sayfaları kapatalım

        System.setProperty("webriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
