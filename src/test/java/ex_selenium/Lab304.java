package ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab304 {

    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://bing.com");


        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vmo.com");
        driver.navigate().to(new URL("http://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
