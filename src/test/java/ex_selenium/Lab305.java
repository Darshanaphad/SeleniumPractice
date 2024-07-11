package ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {

    @Test
    public void testVMOLoginTitle(){

        WebDriver driver = new ChromeDriver();
        //driver.get("app.vwo.com"); // http mandatory
        driver.get("https://app.vmo.com");
        Assert.assertEquals(driver.getTitle(),"Login - VMO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
