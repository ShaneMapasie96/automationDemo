package Academy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

    @Test
    public void getData() {

        System.out.println("Hello Guys");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://shanemapasie-h5b4b2gcfxbzf5gu.southafricanorth-01.azurewebsites.net/webapp/");

            String text = driver.findElement(By.cssSelector("h1")).getText();

            System.out.println(text);

            Assert.assertEquals(
                "RahulShettyAcademy.com Learning",
                text
            );

        } finally {
            driver.quit();
        }
    }
}
