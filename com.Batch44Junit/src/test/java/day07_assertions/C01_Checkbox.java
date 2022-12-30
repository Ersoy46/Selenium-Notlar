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

public class C01_Checkbox {

    // https://the-internet.herokuapp.com/checkboxes sayfasına gidin.
    //a. Checkbox1 ve checkbox2 elementlerini locate edin.
    //b. Checkbox1 seçili değilse onay kutusunu tıklayın
    //c. Checkbox2 seçili değilse onay kutusunu tıklayın.

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

@Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

Thread.sleep(4000);
if (!checkbox1.isSelected()){
    checkbox1.click();
}
if (!checkbox2.isSelected()){
    checkbox2.click();
}
}
@After
    public void teardown(){
        driver.close();
}




}
