package day04XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    //Bir Class oluşturun
    //main method oluşturun ve aşagıdaki görevi tamalayın
    //https://www.amazon.com sayfasına gidin
    //search(ara) "city bike"
    //amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //sonra karşınıza çıkan ilk sonucun resmine tıklayın

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");
        WebElement sourcearamTusu = driver.findElement(By.id("twotabsearchtextbox"));
        sourcearamTusu.sendKeys("city bike" + Keys.ENTER);
        // sourcearamTusu.submit();
        WebElement sonucarama = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucarama.getText());
        WebElement ilkÜrünİsmi = driver.findElement(By.className("s-image"));
        ilkÜrünİsmi.click();
    }
}
