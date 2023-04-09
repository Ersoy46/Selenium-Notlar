package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day07_Ucuncu_gun_Web_Element {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://testadressbook.com");
    }


}
    //bir class oluşturun
    //main method oluşturun ve aşagıdaki görevi tamalayın
    // a-) https://testadressbook.com adresine gidin
    // b-) sign in butanuna basınız
    //   c-) email tesxbox,password tesxbox,and sign button elementlerini locate ediniz.
    //    d-)kullanıcı adını ve şifreyi aşagıya girin ve oturum açın
    //i-) username:testtechproed@gmail.com
    //      ii-) password:Test1234!
    //e-)expected user in testtechproed@gmail.com oldugunu dogrulayın
    //  f-)adressed ve Sign out  textlerinin görüntülendigi(displayed) dogrulayın
    //3-)sayfada kaç tane link oldugunu bulun

