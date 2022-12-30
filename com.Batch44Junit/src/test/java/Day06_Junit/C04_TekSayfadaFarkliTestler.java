package Day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//blic class C04_TekSayfadaFarkliTestler {
//tatic   WebDriver driver;

//  @Test
//  public void test01() {
//      //amazon sayfasına nutella için arama yapip sonuç yazisinin nutella içerdiğini test edelim
//      driver.get("https://www.amazon.com");

//  }

//  @Test
//  public void test02() {
//      //amazon sayfasında java için arama yapip sonuc yazisinin java içerdigini test edelim

//  }

//  @Test
//  public void test03() {
//      //amazon sayfasında ali için arama yapip sonuc yazisinin ali içerdigini test edelim
//  }

//eforeClass
//  public static void ayarlarıDuzenle(){
//      WebDriverManager.chromedriver().setup();
//      driver=new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//  }

//fterClass
//blic static void ortalıgıTopla(){
//      driver.close();
//

//
