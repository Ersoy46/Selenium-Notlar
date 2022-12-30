package Day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTestMethodu {
    WebDriver driver;

    @Test
    public void test01() {
        //  System.out.println("1.test methodu çalıştı");
driver.get("https://www.amazon.com");
String actualTitle=driver.getTitle();
String arananKelime="amazon";

if (actualTitle.contains(arananKelime)){
    System.out.println("PASS");
}else{
    System.out.println("FAİLED");
}

    }

    @Test
    public void test02() {
        //  System.out.println("2.test methodu çalıştı");
        driver.get("htpps:www.google.com");
        String actualTitle=driver.getTitle();
        String arananKElime="google";
        if (actualTitle.contains(arananKElime)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }
    }

    @Before
    public void ayarlarDuzenle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
   @After
    public void ortalıgıTopla(){


    }
}