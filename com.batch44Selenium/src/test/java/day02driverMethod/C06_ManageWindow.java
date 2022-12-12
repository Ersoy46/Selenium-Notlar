package day02driverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        //yeni bir class oluşturulaım
        //amazon sayfasına gidelim
        //sayfanın konumunu ve boyutlarını yazdırın
        //sayfayı simge durumuna getirin
        //simge durumunda 3 saniye bekleyip sonra mazimize yapın
        //sayfanın konumunu ve boyutlarını mazimize durumunda yzdırın
        //sayfanın konumunu ve boyularını fullscreen durumunda yazdırın
        //sayfayı kapatın

        System.setProperty("webriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.close();
    }
}
