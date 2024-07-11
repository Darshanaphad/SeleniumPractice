package ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab302 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
       // ChromeDriver driver2 = new ChromeDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.manage().window().maximize();
    }
}
